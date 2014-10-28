package database.dao;

import com.mongodb.MongoClient;
import database.adapter.MongoDBAdapter;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import java.util.List;

/**
 * Created by david on 10/28/2014.
 */
public abstract class MongoEntityDAO<T ,K > extends BasicDAO  {

    public MongoEntityDAO(MongoClient mongo, Morphia morphia) {
        super(mongo, morphia, MongoDBAdapter.getMongoDBAdapter().getDatabase());
    }

    public List<T> getAll() {
        return getDatastore().find(getEntityClass()).asList();
    }
}
