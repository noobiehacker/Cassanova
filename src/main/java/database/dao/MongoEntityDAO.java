package database.dao;

import cassanovaSystem.StaticString;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import database.adapter.MongoDBAdapter;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.*;
import org.mongodb.morphia.dao.BasicDAO;

import java.util.List;

/**
 * Created by david on 10/28/2014.
 */
public abstract class MongoEntityDAO<T ,K > extends BasicDAO  {

    public MongoEntityDAO(MongoClient mongo, Morphia morphia) {
        super(mongo, morphia, StaticString.getString("testDB"));
    }

    public List<T> getAll() {
        return getDatastore().find(getEntityClass()).asList();
    }

    public Object get(int id)
    {
        return this.get(id);
    }

    public Key insert(T obj)
    {
        return this.save(obj);
    }

    public Key update(T obj)
    {
        return this.save(obj);
    }

    public WriteResult delete(int id)
    {
        return this.deleteById(id);
    }
}
