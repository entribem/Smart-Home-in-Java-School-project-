package smart_home.device;

public class Stove extends Device {

    public Stove(int consumption, String documentation) {
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
