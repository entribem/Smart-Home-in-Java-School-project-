package smart_home.device;

import smart_home.house.Room;

public class Stove extends Device {
    private static final int STANDARD_STOVE_ELECTRICITY_CONSUMPTION = 20;

    public Stove(String documentation, Room room) {
        this.room = room;
        this.gasConsumption.setValue(-1);
        this.waterConsumption.setValue(-1);
        this.documentation = documentation;
        this.turnOff();
    }

    @Override
    public void use() {
        if (this.currentState == State.IDLE) {
            this.setState(new ActiveState());
            this.currentState = State.ACTIVE;
            this.electricityConsumption.setValue(STANDARD_STOVE_ELECTRICITY_CONSUMPTION);
        }
    }
}
