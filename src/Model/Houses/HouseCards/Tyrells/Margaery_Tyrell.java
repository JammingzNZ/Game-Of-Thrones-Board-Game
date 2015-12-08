package Model.Houses.HouseCards.Tyrells;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Margaery_Tyrell implements HouseCard {
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
        //TODO: Gain a fort Icon
    }

    @Override
    public void performPostBattle() {

    }
}
