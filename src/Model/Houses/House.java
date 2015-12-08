package Model.Houses;

import Model.Houses.HouseCards.HouseCard;
import Model.Map.Province;

import java.util.Set;

/**
 * Created by jaln on 1/12/15.
 */
public class House {

    // The Min and Max amount of power tokens
    int MAXTOKENS = 20;
    int MINTOKENS = 0;

    // These Sets are collections of different classes associated with a House
    private Set provinces;
    private Set houseCards;
    private Set intialHouseCards;

    // These are set to the base game of Game Of Thrones, no setters are available.
    // These Integers show how many of each Unit type the House has available
    private int availableFootmen = 10;
    private int availableKnights = 5;
    private int availableShips = 6;
    private int availableSiegeEngienes = 2;
    private int availablePowerTokens = MAXTOKENS;

    private int powerTokens = MINTOKENS;

    /**
     * Get the provinces that this House controls
     * @return the provinces that are in the House's control
     */
    public Set getProvinces() {
        return provinces;
    }

    /**
     * Adds a province into the control of the House
     * @param province
     */
    public void addProvince(Province province) {
        provinces.add(province);
    }

    /**
     * Removes the province from the control of the House
     * @param province
     */
    public void removeProvince(Province province) {
        provinces.remove(province);
    }

    /**
     * Gets the hand of House Cards
     * @return hand of House Cards
     */
    public Set getHouseCards() {
        return houseCards;
    }

    /**
     * Removes a House Card from the Hand
     * @param housecard
     */
    public void removeHouseCard(HouseCard housecard) {
        houseCards.remove(housecard);
    }

    /**
     * Resets the Hand of House Cards
     */
    public void resetHouseCards() {
        houseCards.addAll(intialHouseCards);
    }

    /**
     * Gets the number of available Footman that can be placed
     * @return number of available Footman
     */
    public int getAvailableFootman() {
        return availableFootmen;
    }

    /**
     * Gets the number of available Knights that can be placed
     * @return number of available Knights
     */
    public int getAvailableKnights() {
        return availableKnights;

    }
    /**
     * Gets the number of available Ships that can be placed
     * @return number of available Ships
     */
    public int getAvailableShips() {
        return availableShips;
    }

    /**
     * Gets the number of available Siege Engienes that can be placed
     * @return number of available Siege Engienes
     */
    public int getAvailableSiegeEngienes() {
        return availableSiegeEngienes;
    }



    /**
     * Reduces the amount of Footman that this House has available
     */
    public void placeFootman() {
        availableFootmen =- 1;
    }

    /**
     * Increases the amount of Footmen that this House has Available
     */
    public void retrieveFootman() {
        availableFootmen =+ 1;
    }

    /**
     * Reduces the amount of Knights that this House has Available
     */
    public void placeKnight() {
        availableKnights =- 1;
    }

    /**
     * Increases the amount of Knights that this House has Available
     */
    public void retrieveknight() {
        availableKnights =+ 1;
    }

    /**
     * Reduces the amount of Ships that this House has Available
     */
    public void placeShip() {
        availableShips =- 1;
    }

    /**
     * Increases the amount of Ships that this House has Available
     */
    public void retrieveShip() {
        availableShips =+ 1;
    }

    /**
     * Reduces the amount of SiegeEngienes that this House has Available
     */
    public void placeSiegeEngiene() {
        availableSiegeEngienes =- 1;
    }

    /**
     * Increases the Amount of Siege Engienes that this House has Available
     */
    public void retrieveSiegeEngiene() {
        availableSiegeEngienes =+ 1;
    }

    /**
     * Gets the amount of power tokens that the House can spend
     * @return the number of Power Tokens the House can spend
     */
    public int getPowerTokens() {
        return powerTokens;
    }

    /**
     * Called when the House is collecting power tokens. Removes that amount from the House's available power tokens and
     * adds them to the House's spending tokens
     * @param powerTokens the number of power tokens this House is collecting
     */
    public void collectPowerTokens(int powerTokens) {
        if (powerTokens > availablePowerTokens) {
            powerTokens = availablePowerTokens;
        }
        this.powerTokens =+ powerTokens;
        availablePowerTokens =- powerTokens;
    }

    /**
     * Called when the House is spending the power tokens. Removes that amount from the House's spending power tokens and
     * adds them to the House's available spending tokens
     * @param powerTokens
     */
    public void spendPowerTokens(int powerTokens) {
        this.powerTokens =- powerTokens;
        availablePowerTokens =+ powerTokens;
    }

    /**
     * Removes one Power token from the House's Available Power Tokens to maintain influence in an area
     */
    public void placePowerToken() {
        powerTokens =- 1;
    }

    /**
     * Returns one power token from the House's old provinces and returns it to the House's available power tokens
     */
    public void returnPowerToken() {
        availablePowerTokens =+ 1;
    }
}
