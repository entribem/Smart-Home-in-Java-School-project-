package smart_home.device;

import smart_home.house.Room;

public class Washer extends Device {
    private static final int STANDARD_FRIDGE_ELECTRICITY_CONSUMPTION = 20;
    private static final int STANDARD_FRIDGE_WATER_CONSUMPTION = 20;

    public Washer(String documentation, Room room) {
        this.room = room;
        this.gasConsumption.setValue(-1);
        this.durability.setValue(50);
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
                this.waterConsumption.setValue(STANDARD_FRIDGE_WATER_CONSUMPTION);
            }
            else {
                System.out.println("washing machine does not have clothes in it\n");
            }
        }
    }
}
