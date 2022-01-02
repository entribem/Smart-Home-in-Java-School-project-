package smart_home.device;

public class TV extends Device {

    public TV(int consumption, String documentation) {
        this.consumption = consumption;
        this.documentation = documentation;
    }

    @Override
    public void use() {
        if (this.currentState == State.IDLE) {
            this.setState(new ActiveState());
            this.currentState = State.ACTIVE;
        }
    }
}
