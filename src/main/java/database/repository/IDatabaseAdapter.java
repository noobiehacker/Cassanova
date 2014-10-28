package database.repository;

import org.mongodb.morphia.Datastore;

/**
 * Created by david on 10/24/2014.
 */
public interface IDatabaseAdapter {

    boolean connect();
    boolean disconnect();
    Datastore getDataStore();

}
