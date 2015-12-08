package Model.Houses.HouseCards.Lannister;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Tyrion_Lannister implements HouseCard {
    private int cardBonus = 1;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {
        // TODO: OPTION: Cancel opponents card and return it to their hand. They may choose another in their hand
    }

    @Override
    public void performPreBattle() {

    }

    @Override
    public void performPostBattle() {

    }
}
