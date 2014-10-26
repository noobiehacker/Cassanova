package model;
import java.util.Date;

/**
 * Created by david on 10/24/2014.
 */
public class Message {

    private String subject;
    private String cassanovaName;
    private String roseName;
    private String message;
    private Date createDateTime;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCassanovaName() {
        return cassanovaName;
    }

    public void setCassanovaName(String cassanovaName) {
        this.cassanovaName = cassanovaName;
    }

    public String getRoseName() {
        return roseName;
    }

    public void setRoseName(String roseName) {
        this.roseName = roseName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }



}
