package Model.Houses.HouseCards.Lannister;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Ser_Jamie_Lannister implements HouseCard {
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
        //TODO: Gain Sword Icon
    }

    @Override
    public void performPostBattle() {

    }
}
