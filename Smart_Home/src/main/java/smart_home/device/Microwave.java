package smart_home.device;

import smart_home.house.Room;

public class Microwave extends Device {
    private static final int STANDARD_MICROWAVE_ELECTRICITY_CONSUMPTION = 20;

    public Microwave(String documentation, Room room) {
        this.room = room;
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
                this.electricityConsumption.setValue(STANDARD_MICROWAVE_ELECTRICITY_CONSUMPTION);
            }
            else {
                System.out.println("microwave does not have food in it\n");
            }
        }
    }
}
