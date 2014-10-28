package database.repository;

import com.google.gson.JsonObject;
import enumurator.DatingSiteEnum;
import model.DatingSite;

import java.util.List;

/**
 * Created by david on 10/27/2014.
 */
public class DatingSiteRepository extends MongoRepository{

    public DatingSiteRepository(){

    }

    public DatingSite getDatingSite(DatingSiteEnum datingSite){
        return null;
    }
    @Override
    JsonObject get(int id) {
        return null;
    }
    @Override
    List<JsonObject> getAll() {
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
