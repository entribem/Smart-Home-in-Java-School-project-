package smart_home.device;

public class Fridge extends Device {
    private static final int STANDARD_FRIDGE_ELECTRICITY_CONSUMPTION = 20;

    public Fridge(String documentation) {
        this.gasConsumption.setValue(-1);
        this.waterConsumption.setValue(-1);
        this.documentation = documentation;
        this.turnOff();
    }

    @Override
    public void use() {
        if (this.currentState == State.IDLE) {
            if (hasContent) {
                this.setState(new ActiveState());
                this.currentState = State.ACTIVE;
                this.electricityConsumption.setValue(STANDARD_FRIDGE_ELECTRICITY_CONSUMPTION);
            }
            else {
                System.out.println("fridge does not have food in it\n");
            }
        }
    }
}
