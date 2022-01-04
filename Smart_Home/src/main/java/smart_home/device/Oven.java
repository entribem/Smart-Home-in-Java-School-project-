package smart_home.device;

import smart_home.house.Room;

public class Oven extends Device {
    private static final int STANDARD_OVEN_GAS_CONSUMPTION = 20;

    public Oven(String documentation, Room room) {
        this.room = room;
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
