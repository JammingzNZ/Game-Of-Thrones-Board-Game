package Model.Houses.HouseCards.Lannister;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Ser_Gregor_Clegane implements HouseCard {
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
        //TODO: Gain 3 sword icons
    }

    @Override
    public void performPostBattle() {

    }
}
