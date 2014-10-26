package model;

import enumurator.DatingSiteEnum;

/**
 * Created by david on 9/15/2014.
 */
public class Credential {

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
