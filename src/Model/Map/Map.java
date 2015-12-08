package Model.Map;

import java.util.Collection;
import java.util.Set;

/**
 * Overview of all the provinces manly used for testing currently
 */
public class Map {

    //set of provinces on the map
    private static Set<Province> provinces = null;

    /**
     * Adds provinces to the map
     * @param province the set of provinces to be added
     */
    public void addProvinces(Collection<Province> province) {
        provinces.addAll(provinces);
    }

    /**
     * Removes provinces from the map
     * @param province the set of provinces to be removed
     */
    public void removeProvinces(Collection<Province> province) {
        provinces.removeAll(provinces);
    }

    /**
     * gets the set of provinces
     * @return provinces
     */
    public Set<Province> getProvinces() {
        return provinces;
    }

}
