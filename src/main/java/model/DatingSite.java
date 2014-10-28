package model;

import enumurator.DatingSiteEnum;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by david on 9/15/2014.
 */
@Entity
/**
 * Created by david on 10/24/2014.
 */
public class DatingSite {
    @Id
    private ObjectId id;
    public DatingSiteEnum datingSite;
    public String url;

}
