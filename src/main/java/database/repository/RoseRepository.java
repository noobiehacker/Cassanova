package database.repository;

import com.google.gson.JsonObject;
import model.Rose;

import java.util.List;

/**
 * Created by david on 10/24/2014.
 */
public class RoseRepository extends MongoRepository{
    @Override
    JsonObject get(int id) {
        return null;
    }

    @Override
    List<JsonObject> getAll() {
        IDatabaseAdapter dbAdapter = getDbAdapter();
        List<Rose> roses =dbAdapter.getDataStore().find(Rose.class).asList();
        return null;
    }

    @Override
    JsonObject insert(JsonObject obj) {
        return null;
    }

    @Override
    JsonObject update(JsonObject obj) {
        return null;
    }

    @Override
    boolean delete(int id) {
        return false;
    }
}
