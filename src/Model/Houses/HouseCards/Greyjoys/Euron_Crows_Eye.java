package Model.Houses.HouseCards.Greyjoys;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Euron_Crows_Eye implements HouseCard {
    private int cardBonus = 4;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {

    }

    @Override
    public void performPreBattle() {
        //TODO: Gain sword Icon
    }

    @Override
    public void performPostBattle() {

    }
}
