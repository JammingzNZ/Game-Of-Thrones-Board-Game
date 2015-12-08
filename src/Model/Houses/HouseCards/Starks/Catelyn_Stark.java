package Model.Houses.HouseCards.Starks;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Catelyn_Stark implements HouseCard {
    private int cardBonus = 0;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {

    }

    @Override
    public void performPreBattle() {
        //TODO: If defense order token then double bonus
    }

    @Override
    public void performPostBattle() {

    }
}