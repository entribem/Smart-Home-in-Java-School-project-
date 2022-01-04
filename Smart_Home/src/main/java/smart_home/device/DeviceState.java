package smart_home.device;

enum State {
    ACTIVE, //add different consumption for every state
    IDLE,
    OFF
}

public interface DeviceState {
    void turnOn(Device device);
    void turnOff(Device device);
    void use(Device device);
}
