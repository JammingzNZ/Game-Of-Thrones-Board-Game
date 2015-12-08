package Model.Units;

/**
 * Created by jaln on 2/12/15.
 */
public class SiegeEngiene implements Unit {

    private int strength = 0;
    private String id;

    /**
     * Constructor for the SiegeEngiene class
     * @param id
     */
    public void SiegeEngiene(String id) {
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
