package database.repository;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;

import java.util.List;

/**
 * Created by david on 10/27/2014.
 */
public abstract class MongoRepository<T> {

    private IDatabaseAdapter dbAdapter ;
    private Datastore dataStore;

    private IDatabaseAdapter getDbAdapter() {
        if(dbAdapter==null)
            dbAdapter= MongoDBAdapter.getMongoDBAdapter();
        return dbAdapter;
    }

    protected Datastore getDataStore(){
        return getDbAdapter().getDataStore();
    }
    abstract T get(int id);
    abstract List<T> getAll();
    abstract Key insert(T obj);
    abstract T update(T obj);
    abstract boolean delete(int id);
}
