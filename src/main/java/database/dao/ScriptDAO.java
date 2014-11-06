package database.dao;

import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import model.ScriptMessage;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;

import java.util.List;

/**
 * Created by david on 10/28/2014.
 */
public class ScriptDAO extends BasicDAO<ScriptMessage, ObjectId> implements MongoEntityDAO<ScriptMessage, ObjectId>
{
    public ScriptDAO(Morphia morphia, MongoClient mongo){
        super(mongo, morphia ,"testdb");
    }

    @Override
    public List<ScriptMessage> getAll() {
       QueryResults<ScriptMessage> queryResult = super.find();
        return null;
    }

    @Override
    public ScriptMessage get(ObjectId id) {
        return super.get(id);
    }

    @Override
    public Key insert(ScriptMessage obj) {
        return null;
    }

    @Override
    public Key update(ScriptMessage obj) {
        return null;
    }

    @Override
    public Boolean delete(ObjectId id) {
        super.deleteById(id);
        return true;
    }
}
