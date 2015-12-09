package Model.Houses.HouseCards;

/**
 * Created by jaln on 1/12/15.
 */
public interface HouseCard {
    public int getCardBonus();
    public void performImmediately();
    public void performPreBattle();
    public void performPostBattle();
}