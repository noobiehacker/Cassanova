package database.dao;

import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.*;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.QueryResults;

import java.util.List;

/**
 * Created by david on 10/28/2014.
 */
public abstract class MongoEntityDAO<T ,K > extends BasicDAO<T,K> implements IDAO<T,K>{

    public MongoEntityDAO(Morphia morphia, MongoClient mongo){
        super(mongo, morphia ,"testdb");
    }

    public QueryResults<T> getAll(){
        return super.find();
    }

    public T get(K id){
        return super.get(id);
    }

    public Key insert(T obj){
        return super.save(obj);
    }

    public Key update(T obj){
        return super.save(obj);
    }

    public WriteResult deleteById(K id){
        return super.deleteById(id);
    }
}
