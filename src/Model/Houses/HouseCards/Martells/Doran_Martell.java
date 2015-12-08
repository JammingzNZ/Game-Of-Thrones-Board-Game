package Model.Houses.HouseCards.Martells;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Doran_Martell implements HouseCard {
    private int cardBonus = 0;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {
        //TODO: Move opponent to bottom of an influence track
    }

    @Override
    public void performPreBattle() {

    }

    @Override
    public void performPostBattle() {

    }
}
