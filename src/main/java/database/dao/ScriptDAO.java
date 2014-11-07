package database.dao;

import com.mongodb.MongoClient;
import model.ScriptMessage;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;

/**
 * Created by david on 10/28/2014.
 */
public class ScriptDAO extends MongoEntityDAO<ScriptMessage,ObjectId>{

    public ScriptDAO(Morphia morphia, MongoClient mongo){
        super(morphia, mongo);
    }

}
