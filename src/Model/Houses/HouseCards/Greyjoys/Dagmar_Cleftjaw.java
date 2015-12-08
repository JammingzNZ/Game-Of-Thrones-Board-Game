package Model.Houses.HouseCards.Greyjoys;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Dagmar_Cleftjaw implements HouseCard {
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
        //TODO: Gain sword and fort icon
    }

    @Override
    public void performPostBattle() {

    }
}
