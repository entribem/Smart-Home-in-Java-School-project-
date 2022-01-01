package smart_home.device;

public class Washer extends Device {

    public Washer(int consumption, String documentation) {
        this.consumption = consumption;
        this.documentation = documentation;
    }

    @Override
    public void use() {
        if (this.state == State.OFF) {
            this.turnOn();
        }
        this.state = State.ACTIVE;
    }
}
