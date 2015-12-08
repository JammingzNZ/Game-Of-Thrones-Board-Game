package Model.Houses.HouseCards.Tyrells;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Queen_Of_Thorns implements HouseCard {
    private int cardBonus = 0;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {
        //TODO: Remove opponents order tokens adjacent to the area; cannot remove the march that caused this battle
    }

    @Override
    public void performPreBattle() {

    }

    @Override
    public void performPostBattle() {

    }
}
