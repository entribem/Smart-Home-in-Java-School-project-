package smart_home.device;

import smart_home.house.Room;

public class TV extends Device {
    private static final int STANDARD_TV_ELECTRICITY_CONSUMPTION = 20;

    public TV(String documentation, Room room) {
        this.room = room;
        this.gasConsumption.setValue(-1);
        this.waterConsumption.setValue(-1);
        this.durability.setValue(50);
        this.documentation = documentation;
        this.turnOff();
    }

    @Override
    public void use() {
        if (this.currentState == State.IDLE) {
            this.setState(new ActiveState());
            this.currentState = State.ACTIVE;
            this.electricityConsumption.setValue(STANDARD_TV_ELECTRICITY_CONSUMPTION);
        }
    }
}
