package database.repository;

import com.google.gson.JsonObject;

import java.util.List;

/**
 * Created by david on 10/27/2014.
 */
public abstract class MongoRepository {

    private IDatabaseAdapter dbAdapter ;

    public IDatabaseAdapter getDbAdapter() {
        if(dbAdapter==null)
            dbAdapter= MongoDBAdapter.getMongoDBAdapter();
        return dbAdapter;
    }

    abstract JsonObject get(int id);
    abstract List<JsonObject> getAll();
    abstract JsonObject insert(JsonObject obj);
    abstract JsonObject update(JsonObject obj);
    abstract boolean delete(int id);
}
