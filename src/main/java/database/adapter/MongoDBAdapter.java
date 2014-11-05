package database.adapter;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import cassanovaSystem.StaticString;

/**
 * Created by david on 10/24/2014.
 */
public class MongoDBAdapter implements IDatabaseAdapter {

    private Datastore dataStore ;
    private Morphia morphia;
    private MongoClient mongoClient;
    private String server;
    private String database;
    private int port =Integer.parseInt(StaticString.getString("magicNumberError"));

    public MongoDBAdapter(){
    }

    public Morphia getMorphia() {
        if(morphia==null)
            initializeMorphia();
        return morphia;
    }

    public MongoClient getMongoClient() {
        if(mongoClient==null)
            initializeMongoClient();
        return mongoClient;
    }

    private String getDatabase() {
        if(database==null)
            initializeSettings();
        return database;
    }

    public Datastore getDataStore() {
        if(dataStore==null)
            initializeDataStore();
        return dataStore;
    }

    private String getServer() {
        if(server==null)
            initializeSettings();
        return server;
    }

    private int getPort() {
        String testTemp=StaticString.getString("magicNumberError");
        if(port==Integer.parseInt(StaticString.getString("magicNumberError")))
            initializeSettings();
        return port;
    }

    private void initializeMongoClient() {
        try {
            this.mongoClient = new MongoClient(getServer(),getPort());
        }
        catch(Exception e)
        {
        }
    }

    private void initializeMorphia() {
        this.morphia = new Morphia();
        initializeMappings();
    }

    private void initializeDataStore() {
        this.dataStore = getMorphia().createDatastore(getMongoClient(), getDatabase());
    }

    private void initializeSettings(){
        this.server = StaticString.getString("server");
        this.port = Integer.parseInt(StaticString.getString("port"));
        this.database =StaticString.getString("testDB");
    }

    private void initializeMappings(){
        Morphia morphia = getMorphia();
        if(morphia==null)
            initializeMorphia();
        mapModelPackage();
    }

    private void mapModelPackage(){
        getMorphia().mapPackage("model");
    }


}