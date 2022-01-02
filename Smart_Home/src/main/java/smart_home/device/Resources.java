package smart_home.device;

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

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    void setValue(int value) {
        this.value = value;
    }
    
}
