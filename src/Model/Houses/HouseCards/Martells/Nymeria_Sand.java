package Model.Houses.HouseCards.Martells;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Nymeria_Sand implements HouseCard {
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
        //TODO: If defending; Gain fort icon, if attacking; Gain sword icon
    }

    @Override
    public void performPostBattle() {

    }
}
