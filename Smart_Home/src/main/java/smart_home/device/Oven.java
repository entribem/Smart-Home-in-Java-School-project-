package smart_home.device;

public class Oven extends Device {

    public Oven(int consumption, String documentation) {
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
