package Model.Houses.HouseCards.Lannister;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Ser_Kevan_Lannister implements HouseCard {
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
        //TODO: If attacking all Lannister footman count as +2
    }

    @Override
    public void performPostBattle() {

    }
}
