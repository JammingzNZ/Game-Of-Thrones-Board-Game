package Model.Houses.HouseCards.Martells;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Areo_Hotah implements HouseCard {
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
        //TODO: Gain a fort icon
    }

    @Override
    public void performPostBattle() {

    }
}
