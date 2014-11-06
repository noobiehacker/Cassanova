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
public interface MongoEntityDAO<T ,K >   {

    public List<T> getAll();

    public T get(K id);

    public Key insert(T obj);

    public Key update(T obj);

    public Boolean delete(K id);

}
