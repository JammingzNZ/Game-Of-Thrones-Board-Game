package Model.Houses.HouseCards.Tyrells;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Mace_Tyrell implements HouseCard {
    private int cardBonus = 4;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {
        //TODO: Destroy an opponents footmen
    }

    @Override
    public void performPreBattle() {

    }

    @Override
    public void performPostBattle() {

    }
}
