package Model.Houses.HouseCards.Greyjoys;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Victarion_Greyjoy implements HouseCard {
    private int cardBonus = 3;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {

    }

    @Override
    public void performPreBattle() {
        // TODO: If attacking; all greyjoy ships worth 2 instead of 1
    }

    @Override
    public void performPostBattle() {

    }
}
