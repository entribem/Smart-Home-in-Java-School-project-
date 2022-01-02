package smart_home.device;

public class Washer extends Device {

    public Washer(int consumption, String documentation) {
        this.consumption = consumption;
        this.documentation = documentation;
    }

    @Override
    public void use() {
        if (this.currentState == State.IDLE) {
            if (hasContent) {
                this.setState(new ActiveState());
                this.currentState = State.ACTIVE;
            }
            else {
                System.out.println("washing machine does not have clothes in it\n");
            }
        }
    }
}
