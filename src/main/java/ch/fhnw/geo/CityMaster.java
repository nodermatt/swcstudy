package ch.fhnw.geo;

public class CityMaster {
    private City[] cities;
    private String name;

    public CityMaster(String name) {
        this.name = name;
    }

    /**
     * Accepts an _arbitrary_ number of Cities and returns the total population
     * @return The total population of the passed cities
     */
    public int countPopulation() {
        // TODO: Implement
        return 0;
    }

    /**
     * Searches the array for the given city
     * @return whether or not the city is in the array
     */
    public boolean searchCity(String city) {
        // TODO: Implement
        return false;
    }

    public City[] getCities() {
        return cities;
    }

    public String getName() {
        return name;
    }
}
