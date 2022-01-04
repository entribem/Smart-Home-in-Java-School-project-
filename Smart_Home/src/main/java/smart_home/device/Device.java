package smart_home.device;

import smart_home.house.Room;

public abstract class Device {
    protected DeviceState state;
    protected State currentState;
    protected Resources electricityConsumption = Resources.Electricity;
    protected Resources gasConsumption = Resources.Gas;
    protected Resources waterConsumption = Resources.Water;
    protected Resources durability = Resources.Durability;
    protected String documentation;
    protected boolean hasContent;
    protected Room room;

    public abstract void use();

    public void turnOn() {
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

    public void turnOff() {
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

    public Resources getDurability() {
        return durability;
    }
}
