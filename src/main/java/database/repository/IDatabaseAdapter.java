package database.repository;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * Created by david on 10/24/2014.
 */
public interface IDatabaseAdapter {

    boolean connect();
    boolean disconnect();
    Datastore getDataStore();
    Morphia getMorphia();
    String getDatabase();
    MongoClient getMongoClient();

}
