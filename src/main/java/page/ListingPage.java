package page;


import model.Rose;

import java.util.List;

/**
 * Created by david on 10/24/2014.
 */
public abstract class ListingPage extends WebPage {

    private boolean hasRoses;
    private List<Rose> targetList;

    public boolean isHasRoses() {
        return hasRoses;
    }

    public void setHasRoses(boolean hasRoses) {
        this.hasRoses = hasRoses;
    }

    public List<Rose> getTargetList() {
        return targetList;
    }

    public void setTargetList(List<Rose> targetList) {
        this.targetList = targetList;
    }
}
