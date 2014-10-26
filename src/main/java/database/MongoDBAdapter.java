package database;

/**
 * Created by david on 10/24/2014.
 */
public abstract class MongoDBAdapter implements IDatabaseAdapter {


    @Override
    public boolean connect() {

        Boolean result = false;
        initializeMongoClient();
        initializeMongoDB();
        return result;
    }

    @Override
    public boolean disconnect() {
        return false;
    }

    private void initializeMongoClient() {


    }

    private void initializeMongoDB() {

    }
}
