package Model.Houses.HouseCards.Baratheons;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Brienne_Of_Tarth implements HouseCard {
    private int cardBonus = 2;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {

    }

    @Override
    public void performPreBattle() {
        // TODO: Add sword and tower icons
    }

    @Override
    public void performPostBattle() {

    }
}