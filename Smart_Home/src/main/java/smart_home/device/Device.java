package smart_home.device;

public abstract class Device {
    State state;
    int consumption;
    String documentation;
    boolean hasContent;

    public abstract void use();

    void turnOn() {
        this.state = State.IDLE;
    }

    void turnOff() {
        this.state = State.OFF;
    }

    public State getState() {
        return state;
    }

    public int getConsumption() {
        return consumption;
    }

    public String getDocumentation() {
        return documentation;
    }

    public boolean isHasContent() {
        return hasContent;
    }
}
