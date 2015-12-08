package Model.Houses.HouseCards.Greyjoys;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Balon_Greyjoy implements HouseCard {
    private int cardBonus = 2;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {

    }

    @Override
    public void performPreBattle() {
        //TODO: Printed combat strength on opponents card goes to 0
    }

    @Override
    public void performPostBattle() {

    }
}
