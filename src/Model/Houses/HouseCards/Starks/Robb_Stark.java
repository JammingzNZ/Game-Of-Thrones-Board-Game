package Model.Houses.HouseCards.Starks;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Robb_Stark implements HouseCard {
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

    }

    @Override
    public void performPostBattle() {
        //TODO: If win; choose where enemy retreats; must be legal and cannot make them lose more then min troops possible
    }
}
