package smart_home.device;

public abstract class Device {
    DeviceState state = new OffState();
    State currentState = State.OFF;
    int consumption;
    int electricalConsumption;
    int gasConsumption;
    int waterConsumption;
    String documentation;
    boolean hasContent;

    public abstract void use();

    void turnOn() {
        if (currentState == State.OFF) {
            state.turnOn(this);
            currentState = State.IDLE;
        }
    }

    void turnOff() {
        if (currentState == State.IDLE) {
            state.turnOff(this);
            currentState = State.OFF;
        }
    }

    public void setState(DeviceState state) {
        this.state = state;
    }

    public State getState() {
        return currentState;
    }

    public int getElectricalConsumption() {
        return electricalConsumption;
    }

    public int getGasConsumption() {
        return gasConsumption;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public String getDocumentation() {
        return documentation;
    }

    public boolean isHasContent() {
        return hasContent;
    }
}
