package Model.Houses.HouseCards.Baratheons;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Melisandre implements HouseCard {
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
        // TODO: Add sword to battle
    }

    @Override
    public void performPostBattle() {

    }
}