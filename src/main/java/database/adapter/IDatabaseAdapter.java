package database.adapter;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * Created by david on 10/24/2014.
 */
public interface IDatabaseAdapter {

    Datastore getDataStore();
    Morphia getMorphia();
    MongoClient getMongoClient();

}
