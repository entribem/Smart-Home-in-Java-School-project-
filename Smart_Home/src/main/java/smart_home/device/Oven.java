package smart_home.device;

public class Oven extends Device {
    private static final int STANDARD_OVEN_GAS_CONSUMPTION = 20;

    public Oven(String documentation) {
        this.electricityConsumption.setValue(-1);
        this.waterConsumption.setValue(-1);
        this.documentation = documentation;
        this.turnOff();
    }


    @Override
    public void use() {
        if (this.currentState == State.IDLE) {
            this.setState(new ActiveState());
            this.currentState = State.ACTIVE;
            this.gasConsumption.setValue(STANDARD_OVEN_GAS_CONSUMPTION);
        }
    }
}
