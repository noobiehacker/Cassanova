package model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by david on 10/28/2014.
 */
public class Script {

    @Id
    private ObjectId id;
    private String scriptMessage;
}
