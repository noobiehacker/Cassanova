package database.dao;

import com.mongodb.WriteResult;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.QueryResults;

/**
 * Created by david on 14-11-07.
 */
public interface IDAO<T, K> {

    public QueryResults<T> getAll();

    public T get(K id);

    public Key insert(T obj);

    public Key update(T obj);

    public WriteResult deleteById(K id);
}
