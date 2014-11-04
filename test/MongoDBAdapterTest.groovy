package database.adapter

import model.Credential
import model.DatingSite
import model.Message
import model.Rose
import org.mongodb.morphia.Morphia

/**
 * Created by davix on 2014-11-04.
 */
class MongoDBAdapterTest extends GroovyTestCase {

    private MongoDBAdapter MongoDBAdapterInstance;

    void setUp() {
        super.setUp()
        MongoDBAdapterInstance = new MongoDBAdapter();
    }

    void tearDown() {
        MongoDBAdapter = null;
    }

    void testGetMorphia() {
        assertEquals(MongoDBAdapterInstance.getMorphia(),new Morphia());
    }

    void testGetMongoClient() {

    }

    void testGetDataStore() {

    }

    void testMapModelPackage(){
         assertEquals(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Credential.class));
         assertEquals(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(DatingSite.class));
         assertEquals(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Message.class));
         assertEquals(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Rose.class));
         assertEquals(MongoDBAdapterInstance.getMorphia().getMapper().isMapped(Script.class));
        }

    }
}
