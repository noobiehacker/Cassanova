package model;

import enumurator.DatingSiteEnum;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by david on 9/15/2014.
 */
@Entity

public class Credential {

    @Id
    private ObjectId id;
    private String userName;
    private String password;
    private DatingSiteEnum datingSite;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DatingSiteEnum getDatingSite() {
        return datingSite;
    }

    public void setDatingSite(DatingSiteEnum datingSite) {
        this.datingSite = datingSite;
    }
}
