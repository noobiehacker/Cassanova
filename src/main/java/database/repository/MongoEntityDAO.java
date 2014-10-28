package database.repository;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import java.util.List;

/**
 * Created by david on 10/28/2014.
 */
public abstract class MongoEntityDAO<T ,K > extends BasicDAO  {

    private Datastore dataStore;


    public MongoEntityDAO(MongoClient mongo, Morphia morphia) {
        super(mongo, morphia, MongoDBAdapter.getMongoDBAdapter().getDatabase());
        setDataStore(MongoDBAdapter.getMongoDBAdapter().getDataStore());
    }

    public Datastore getDataStore() {
        return dataStore;
    }

    private void setDataStore(Datastore dataStore) {
        this.dataStore = dataStore;
    }

    abstract List<T> getAll();
}
