package Model.Houses.HouseCards.Starks;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Eddard_Stark implements HouseCard {
    private int cardBonus = 1;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {

    }

    @Override
    public void performPreBattle() {
        //TODO: Gain 2 sword icons
    }

    @Override
    public void performPostBattle() {

    }
}
