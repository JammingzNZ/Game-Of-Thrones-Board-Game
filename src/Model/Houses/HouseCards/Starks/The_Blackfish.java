package Model.Houses.HouseCards.Starks;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class The_Blackfish implements HouseCard {
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

    }

    @Override
    public void performPostBattle() {
        //TODO: Take no casualties from anything
    }
}