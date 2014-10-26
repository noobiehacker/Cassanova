package database;

import com.google.gson.JsonObject;

import java.util.List;

/**
 * Created by david on 10/24/2014.
 */
public interface IDatabaseAdapter {

    boolean connect();
    boolean disconnect();

    JsonObject get(int id);
    List<JsonObject> getAll(int id);
    JsonObject insert(JsonObject obj);
    JsonObject update(JsonObject obj);
    boolean delete(int id);
}
