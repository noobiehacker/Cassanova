package page;


import model.Rose;

/**
 * Created by david on 10/24/2014.
 */
public abstract class UserPage extends WebPage {

    private Rose currentRose;

    public Rose getCurrentRose() {
        return currentRose;
    }

    public void setCurrentRose(Rose currentRose) {
        this.currentRose = currentRose;
    }

    public void updateCurrentRose() {
    }
}
