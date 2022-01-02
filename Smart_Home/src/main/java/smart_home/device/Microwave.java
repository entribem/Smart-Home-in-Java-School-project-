package smart_home.device;

public class Microwave extends Device {

    public Microwave(int consumption, String documentation) {
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
                System.out.println("microwave does not have food in it\n");
            }
        }
    }
}
