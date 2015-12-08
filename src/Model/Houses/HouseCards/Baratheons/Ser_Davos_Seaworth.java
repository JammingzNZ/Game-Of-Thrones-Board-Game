package Model.Houses.HouseCards.Baratheons;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Ser_Davos_Seaworth implements HouseCard {
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
    // TODO: If Stannis used; add extra bonus and sword icon
    }

    @Override
    public void performPostBattle() {

    }
}
