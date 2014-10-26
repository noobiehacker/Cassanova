package database;

import com.google.gson.JsonObject;

import java.util.List;

/**
 * Created by david on 10/24/2014.
 */
public class UserRepository extends MongoDBAdapter {
    @Override
    public JsonObject get(int id) {
        return null;
    }

    @Override
    public List<JsonObject> getAll(int id) {
        return null;
    }

    @Override
    public JsonObject insert(JsonObject obj) {
        return null;
    }

    @Override
    public JsonObject update(JsonObject obj) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
