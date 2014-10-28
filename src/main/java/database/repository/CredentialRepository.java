package database.repository;

import com.google.gson.JsonObject;
import enumurator.DatingSiteEnum;
import model.Credential;

import java.util.List;

/**
 * Created by david on 10/24/2014.
 */
public class CredentialRepository extends MongoRepository{

    public Credential getCredential(DatingSiteEnum datingSite){
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
