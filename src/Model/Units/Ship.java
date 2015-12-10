package Model.Units;

/**
 * Created by jaln on 2/12/15.
 */
public class Ship implements Unit {

    private int strength = 1;
    private String id;

    /**
     * Constructor for the Ship class
     * @param id
     */
    public Ship(String id) {
        this.id = id;
    }

    /**
     * Gets the strength of the Unit
     * @return the strength of the unit
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Gets the id for the Unit
     * @return the id for the Unit
     */
    public String getId() {
        return id;
    }
}
