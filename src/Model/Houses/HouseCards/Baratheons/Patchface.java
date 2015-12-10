package Model.Houses.HouseCards.Baratheons;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 2/12/15.
 */
public class Patchface implements HouseCard {
    @SuppressWarnings("FieldCanBeLocal")
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
        //TODO: After combat discard opponents card of your choice
    }
}
