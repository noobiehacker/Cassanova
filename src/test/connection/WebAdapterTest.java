package connection;

import database.repository.CredentialRepository;
import database.repository.DatingSiteRepository;
import enumurator.DatingSiteEnum;
import groovy.util.GroovyTestCase;
import model.Credential;
import model.DatingSite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebAdapterTest extends GroovyTestCase {

    private IWebAdapter webAdapter;

    @Before
    public void setUp() throws Exception {

        Credential credential = new CredentialRepository().getCredential(DatingSiteEnum.OkCupid);
        DatingSite datingSite = new DatingSiteRepository().getDatingSite(DatingSiteEnum.OkCupid);
        credential.setDatingSite(DatingSiteEnum.OkCupid);
        webAdapter = new WebAdapter(credential,datingSite);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testConnect() throws Exception {
        assertTrue(webAdapter.connect());
    }

    @Test
    public void testDisconnect() throws Exception {
        assertTrue(webAdapter.disconnect());
    }

    @Test
    public void testGetCurrentPage() throws Exception {

    }

    @Test
    public void testClickLink() throws Exception {

    }

    @Test
    public void testEditForm() throws Exception {

    }

    @Test
    public void testClickButton() throws Exception {

    }
}