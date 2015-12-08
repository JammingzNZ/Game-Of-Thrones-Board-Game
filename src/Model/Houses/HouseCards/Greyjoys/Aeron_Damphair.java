package Model.Houses.HouseCards.Greyjoys;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Aeron_Damphair implements HouseCard {
    private int cardBonus = 0;

    @Override
    public int getCardBonus() {
        return cardBonus;
    }

    @Override
    public void performImmediately() {
        //TODO: Option: Discard two power tokens to discard this card and choose another
    }

    @Override
    public void performPreBattle() {

    }

    @Override
    public void performPostBattle() {

    }
}
