package smart_home.device;

public abstract class Device {
    DeviceState state;
    State currentState;
    Resources electricityConsumption = Resources.Electricity;
    Resources gasConsumption = Resources.Gas;
    Resources waterConsumption = Resources.Water;
    Resources durability = Resources.Durability;
    String documentation;
    boolean hasContent;

    public abstract void use();

    void turnOn() {
        if (currentState == State.OFF) {
            state.turnOn(this);
            currentState = State.IDLE;
            if (electricityConsumption.getValue() != -1) {
                electricityConsumption.setValue(5);
            }
            if (gasConsumption.getValue() != -1) {
                gasConsumption.setValue(5);
            }
            if (waterConsumption.getValue() != -1) {
                waterConsumption.setValue(5);
            }
        }
    }

    void turnOff() {
        if (currentState == State.IDLE) {
            state.turnOff(this);
            currentState = State.OFF;
            if (electricityConsumption.getValue() != -1) {
                electricityConsumption.setValue(0);
            }
            if (gasConsumption.getValue() != -1) {
                gasConsumption.setValue(0);
            }
            if (waterConsumption.getValue() != -1) {
                waterConsumption.setValue(0);
            }
        }
    }

    public void setState(DeviceState state) {
        this.state = state;
    }

    public State getState() {
        return currentState;
    }

    public Resources getElectricityConsumption() {
        return electricityConsumption;
    }

    public Resources getGasConsumption() {
        return gasConsumption;
    }

    public Resources getWaterConsumption() {
        return waterConsumption;
    }

    public String getDocumentation() {
        return documentation;
    }

    public boolean isHasContent() {
        return hasContent;
    }
}
