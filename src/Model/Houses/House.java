package Model.Houses;

import Model.Provinces.Province;
import com.sun.corba.se.impl.orbutil.closure.Constant;

import java.util.Set;

/**
 * Created by jaln on 1/12/15.
 */
public class House {
    int MAXTOKENS = 20;
    int MINTOKENS = 0;

    // These Sets are collections of different classes associated with a House
    private Set Provinces;
    private Set HouseCards;
    private Set IntialHouseCards;

    // These Integers show how many of each Unit type the House has available
    private int AvailableFootmen = 10;
    private int AvailableKnights = 5;
    private int AvailableShips = 6;
    private int AvailableSiegeEngienes = 2;
    private int AvailablePowerTokens = 20;

    private int PowerTokens = 5;

    /**
     * Get the provinces that this House controls
     * @return the provinces that are in the House's control
     */
    public Set getProvinces() {
        return Provinces;
    }

    /**
     * Adds a province into the control of the House
     * @param province
     */
    public void addProvince(Province province) {
        Provinces.add(province);
    }

    /**
     * Removes the province from the control of the House
     * @param province
     */
    public void removeProvince(Province province) {
        Provinces.remove(province);
    }

    /**
     * Gets the hand of House Cards
     * @return hand of House Cards
     */
    public Set getHouseCards() {
        return HouseCards;
    }

    /**
     * Removes a House Card from the Hand
     * @param housecard
     */
    public void removeHouseCard(HouseCard housecard) {
        HouseCards.remove(housecard);
    }

    /**
     * Resets the Hand of House Cards
     */
    public void resetHouseCards() {
        HouseCards.addAll(IntialHouseCards);
    }

    /**
     * Gets the number of available Footman that can be placed
     * @return number of available Footman
     */
    public int getAvailableFootman() {
        return AvailableFootmen;
    }

    /**
     * Gets the number of available Knights that can be placed
     * @return number of available Knights
     */
    public int getAvailableKnights() {
        return AvailableKnights;

    }
    /**
     * Gets the number of available Ships that can be placed
     * @return number of available Ships
     */
    public int getAvailableShips() {
        return AvailableShips;
    }

    /**
     * Gets the number of available Siege Engienes that can be placed
     * @return number of available Siege Engienes
     */
    public int getAvailableSiegeEngienes() {
        return AvailableSiegeEngienes;
    }



    /**
     * Reduces the amount of Footman that this House has available
     */
    public void placeFootman() {
        AvailableFootmen =- 1;
    }

    /**
     * Increases the amount of Footmen that this House has Available
     */
    public void retrieveFootman() {
        AvailableFootmen =+ 1;
    }

    /**
     * Reduces the amount of Knights that this House has Available
     */
    public void placeKnight() {
        AvailableKnights =- 1;
    }

    /**
     * Increases the amount of Knights that this House has Available
     */
    public void retrieveknight() {
        AvailableKnights =+ 1;
    }

    /**
     * Reduces the amount of Ships that this House has Available
     */
    public void placeShip() {
        AvailableShips =- 1;
    }

    /**
     * Increases the amount of Ships that this House has Available
     */
    public void retrieveShip() {
        AvailableShips =+ 1;
    }

    /**
     * Reduces the amount of SiegeEngienes that this House has Available
     */
    public void placeSiegeEngiene() {
        AvailableSiegeEngienes =- 1;
    }

    /**
     * Increases the Amount of Siege Engienes that this House has Available
     */
    public void retrieveSiegeEngiene() {
        AvailableSiegeEngienes =+ 1;
    }

    /**
     * Gets the amount of power tokens that the House can spend
     * @return the number of Power Tokens the House can spend
     */
    public int getPowerTokens() {
        return PowerTokens;
    }

    /**
     * Called when the House is collecting power tokens. Removes that amount from the House's available power tokens and
     * adds them to the House's spending tokens
     * @param powerTokens the number of power tokens this House is collecting
     */
    public void collectPowerTokens(int powerTokens) {
        PowerTokens =+ powerTokens;
        AvailablePowerTokens =- powerTokens;
        if (PowerTokens > MAXTOKENS) {
            PowerTokens = MAXTOKENS;
            AvailablePowerTokens = MINTOKENS;
        }
    }

    /**
     * Called when the House is spending the power tokens. Removes that amount from the House's spending power tokens and
     * adds them to the House's available spending tokens
     * @param powerTokens
     */
    public void spendPowerTokens(int powerTokens) {
        PowerTokens =- powerTokens;
        AvailablePowerTokens =+ powerTokens;
    }

    /**
     * Removes one Power token from the House's Available Power Tokens to maintain influence in an area
     */
    public void placePowerToken() {
        PowerTokens =- 1;
    }

    /**
     * Returns one power token from the House's old provinces and returns it to the House's available power tokens
     */
    public void returnPowerToken() {
        AvailablePowerTokens =+ 1;
    }
}
