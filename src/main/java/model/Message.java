package model;

import enumurator.MessageTypeEnum;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;

/**
 * Created by david on 10/24/2014.
 */
@Entity
public class Message {
    @Id
    private ObjectId id;
    private String subject;
    private String cassanovaName;
    private String roseName;
    private String message;
    private Date createDateTime;
    private MessageTypeEnum messageType;
    private Boolean replied;

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
