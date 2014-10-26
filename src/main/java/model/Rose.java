package model;

import enumurator.CityEnum;
import enumurator.DatingSiteEnum;

import java.awt.*;

/**
 * Created by david on 10/24/2014.
 */
public class Rose {

    private int age;
    private int score;
    private String userName;
    private String profile;
    private String subjectLine;
    private DatingSiteEnum datingSite;
    private CityEnum city;
    private Image profileImage;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getSubjectLine() {
        return subjectLine;
    }

    public void setSubjectLine(String subjectLine) {
        this.subjectLine = subjectLine;
    }

    public DatingSiteEnum getDatingSite() {
        return datingSite;
    }

    public void setDatingSite(DatingSiteEnum datingSite) {
        this.datingSite = datingSite;
    }

    public CityEnum getCity() {
        return city;
    }

    public void setCity(CityEnum city) {
        this.city = city;
    }

    public Image getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Image profileImage) {
        this.profileImage = profileImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
