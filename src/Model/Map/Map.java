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
     * @param provinceCollection the set of provinces to be added
     */
    public void addProvinces(Collection<Province> provinceCollection) {
        provinces.addAll(provinceCollection);
    }

    /**
     * Removes provinces from the map
     * @param provinceCollection the set of provinces to be removed
     */
    public void removeProvinces(Collection<Province> provinceCollection) {
        provinces.removeAll(provinceCollection);
    }

    /**
     * gets the set of provinces
     * @return provinces
     */
    public Set<Province> getProvinces() {
        return provinces;
    }

}
