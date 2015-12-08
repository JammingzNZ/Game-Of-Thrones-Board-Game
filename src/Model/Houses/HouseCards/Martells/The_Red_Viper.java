package Model.Houses.HouseCards.Martells;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class The_Red_Viper implements HouseCard {
    private int cardBonus = 4;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {

    }

    @Override
    public void performPreBattle() {
        //TODO: Gain 2 sword icons and a fort icon
    }

    @Override
    public void performPostBattle() {

    }
}
