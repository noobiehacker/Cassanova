package database.dao;

import database.adapter.MongoDBAdapter;
import junit.framework.TestCase;
import model.ScriptMessage;
import org.bson.types.ObjectId;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScriptDAOTest extends TestCase {

    private ScriptDAO dao ;
    private MongoDBAdapter adapter;

    @Before
    public void setUp() throws Exception {
        adapter = new MongoDBAdapter();
        dao = new ScriptDAO(adapter.getMorphia(),adapter.getMongoClient());
    }

    @After
    public void tearDown() throws Exception {
        adapter = null;
        dao = null;
    }

    @Test
    public void testGetAll() throws Exception {
    }

    @Test
    public void testGet() throws Exception {
        testCrud();
    }

    @Test
    public void testInsert() throws Exception {
        testCrud();
    }

    @Test
    public void testUpdate() throws Exception {
        testCrud();
    }

    @Test
    public void testDeleteById() throws Exception {
        testCrud();
    }

    @Ignore
    private void testCrud(){

        ScriptMessage insertItem = new ScriptMessage();
        String testInsertString = "ABC123";
        insertItem.setScriptMessage(testInsertString);

        dao.save(insertItem);

        ObjectId id =  insertItem.getId();
        ScriptMessage getItem = dao.get(id);

        //assert both insert and get was correct
        assertEquals(insertItem.getScriptMessage() , getItem.getScriptMessage());

        String testUpdateString = "123def";
        getItem.setScriptMessage(testUpdateString);
        dao.save(getItem);

        ScriptMessage updateItem = dao.get(id);

        //assert it is changed
        assertEquals(updateItem.getScriptMessage() , getItem.getScriptMessage());
        assertNotEquals(updateItem.getScriptMessage() , testInsertString );

        dao.deleteById(id);
        ScriptMessage deletedItem = dao.get(id);
        assertNull(deletedItem);
    }
}