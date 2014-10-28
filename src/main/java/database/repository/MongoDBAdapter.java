package database.repository;

import system.StaticString;
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import model.*;
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
    private static MongoDBAdapter singleton_mongoDBAdapter;

    private MongoDBAdapter(){
    }

    public static MongoDBAdapter getMongoDBAdapter(){
        if(MongoDBAdapter.singleton_mongoDBAdapter==null)
            MongoDBAdapter.singleton_mongoDBAdapter = new MongoDBAdapter();
        return MongoDBAdapter.singleton_mongoDBAdapter;
    }

    @Override
    public boolean connect() {

        Boolean result  = (this.getDataStore()!= null);
        return result;
    }

    @Override
    public boolean disconnect() {
        return false;
    }

    @Override
    public Datastore getDataStore() {
        if(dataStore==null)
            initializeDataStore();
        return dataStore;
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
        morphia.map(Rose.class);
        morphia.map(Message.class);
        morphia.map(DatingSiteRepository.class);
        morphia.map(Credential.class);
    }

    private Morphia getMorphia() {
        if(morphia==null)
            initializeMorphia();
        return morphia;
    }

    private MongoClient getMongoClient() {
        if(mongoClient==null)
            initializeMongoClient();
        return mongoClient;
    }

    private String getServer() {
        if(server==null)
            initializeSettings();
        return server;
    }

    private String getDatabase() {
        if(database==null)
            initializeSettings();
        return database;
    }

    private int getPort() {
        if(port==Integer.parseInt(StaticString.getString("magicNumberError")))
            initializeSettings();
        return port;
    }
}