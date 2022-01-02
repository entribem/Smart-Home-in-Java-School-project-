package smart_home.device;

/**
 * Enum Resources standardize consumption resources.
 */
public enum Resources {
    Electricity("electricity", 0, "kWh"),
    Gas("gas", 0, "kWh"),
    Water("water", 0, "l"),
    Durability("durability", 0, "%");
    
    private final String name;
    private int value;
    private final String unit;

    private Resources(String name, int value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    /**
     * Method getName retrieves name of a resource.
     * @return String 
     */
    public String getName() {
        return name;
    }

    /**
     * Method getValue retrieves value of current consumption.
     * @return int
     */
    public int getValue() {
        return value;
    }

    /**
     * Method getUnit retrieves unit of the resource.
     * @return String
     */
    public String getUnit() {
        return unit;
    }

    void setValue(int value) {
        this.value = value;
    }
    
}
