package database.repository;

import com.mongodb.MongoClient;
import model.Script;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import java.util.List;

/**
 * Created by david on 10/28/2014.
 */
public class ScriptDAO extends MongoEntityDAO<Script, ObjectId>
{
    @Override
    List<Script> getAll() {
        return getDataStore().find(Script.class).asList();
    }

    public ScriptDAO(Morphia morphia, MongoClient mongo){
        super(mongo, morphia);
    }
}
