package database.adapter

import junit.framework.TestCase;
import org.mongodb.morphia.Morphia;
import model.*;
/**
 * Created by david on 14-11-05.
 */
class MongoDBAdapterTest extends TestCase {
    private MongoDBAdapter MongoDBAdapterInstance;

    void setUp() {
        super.setUp();
        MongoDBAdapterInstance = new MongoDBAdapter();
    }

    void tearDown() {
        MongoDBAdapterInstance =  null;
    }

    void testGetMorphia() {
        assertEquals(MongoDBAdapterInstance.getMorphia(),new Morphia());
    }

    void testGetMongoClient() {

    }

    void testGetDataStore() {
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Credential.class));
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(DatingSite.class));
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Message.class));
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Rose.class));
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Script.class));
    }
}