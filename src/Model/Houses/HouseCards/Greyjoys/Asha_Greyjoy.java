package Model.Houses.HouseCards.Greyjoys;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Asha_Greyjoy implements HouseCard {
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
        //TODO: If not supported gain 2 sword and 1 fort icon
    }

    @Override
    public void performPostBattle() {

    }
}
