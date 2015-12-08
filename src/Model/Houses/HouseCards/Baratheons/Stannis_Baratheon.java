package Model.Houses.HouseCards.Baratheons;

import Model.Houses.HouseCards.HouseCard;

/**
 * Created by jaln on 6/12/15.
 */
public class Stannis_Baratheon implements HouseCard {
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
        //TODO: If opponent influence Iron Throne is higher; +1 to bonus
    }

    @Override
    public void performPostBattle() {

    }
}
