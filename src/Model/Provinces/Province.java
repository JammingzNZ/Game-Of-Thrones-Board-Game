package Model.Provinces;

import Model.Units.Unit;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jaln on 1/12/15.
 */
public class Province {

    // The name of the Province
    private String Name;
    // Provinces neighouring Provinces and the Units in that Province
    private Set neighbours;
    private Set units = new HashSet();
    // The different resources in the Province
    private int castle;
    private int crowns;
    private int barrels;
    // Whether the Province is Land/Sea and has a Dock
    private boolean isLand;
    private boolean hasDock;

    public void Province(String name, Set neighbours, int castle, int crowns, int barrels, boolean isLand, boolean hasDock) {
        this.neighbours = neighbours;
        this.castle = castle;
        this.crowns = crowns;
        this.barrels = barrels;
        this.isLand = isLand;
        this.hasDock = hasDock;
    }

    /**
     * Checks if there is a castle ro stronghold in the province
     * @return
     */
    public int getCastle() {
        return castle;
    }

    /**
     * gets the number of crowns for the provincs
     * @return
     */
    public int getCrowns() {
        return crowns;
    }

    /**
     * gets the numberof barrels on the provinces
     * @return barrels
     */
    public int getBarrels() {
        return barrels;
    }

    /**
     * determines if th provinces is on the land
     * @return isLand
     */
    public boolean isLand() {
        return isLand;
    }

    /**
     * checks if the provinces has a dock
     * @return hasDock
     */
    public boolean isHasDock() {
        return hasDock;
    }

    /**
     * getter units
     * @return units
     */
    public Set getUnits() {
        return units;
    }

    /**
     * adds a unit to the set of units
     * @param unit
     */
    public void addUnit(Unit unit){
        units.add(unit);
    }

    /**
     * remove a unit frm the set of units
     * @param unit
     */
    public void removeUnit(Unit unit){
        units.remove(unit);
    }

    /**
     * Gets the neighbours of the Province
     * @return the neighbours of the province
     */
    public Set getNeighbours() {
        return neighbours;
    }
}
