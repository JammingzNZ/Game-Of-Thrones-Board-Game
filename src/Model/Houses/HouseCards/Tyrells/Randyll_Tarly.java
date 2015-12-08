package Model.Houses.HouseCards.Tyrells;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Randyll_Tarly implements HouseCard {
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
        //TODO: Gain a sword icon
    }

    @Override
    public void performPostBattle() {

    }
}
