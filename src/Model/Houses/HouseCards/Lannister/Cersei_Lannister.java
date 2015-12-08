package Model.Houses.HouseCards.Lannister;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Cersei_Lannister implements HouseCard {
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

    }

    @Override
    public void performPostBattle() {
        // TODO: if win; remove opponents order tokens from board
    }
}
