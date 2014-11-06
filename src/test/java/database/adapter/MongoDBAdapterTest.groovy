package database.adapter

import com.mongodb.MongoClient
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
        assertEquals(MongoDBAdapterInstance.getMorphia().getClass(),new Morphia().getClass());
    }

    void testGetMongoClient() {
        assertEquals(MongoDBAdapterInstance.getMongoClient().getClass(),new MongoClient().getClass());
    }

    void testGetDataStore() {
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Credential.class));
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(DatingSite.class));
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Message.class));
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Rose.class));
        assertTrue(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(ScriptMessage.class));
    }
}