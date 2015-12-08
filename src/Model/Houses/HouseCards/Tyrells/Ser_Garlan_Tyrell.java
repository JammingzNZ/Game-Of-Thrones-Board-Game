package Model.Houses.HouseCards.Tyrells;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Ser_Garlan_Tyrell implements HouseCard {
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
        //TODO: Gain 2 sword Icons
    }

    @Override
    public void performPostBattle() {

    }
}
