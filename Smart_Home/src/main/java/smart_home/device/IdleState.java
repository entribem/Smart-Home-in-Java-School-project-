package smart_home.device;

public class IdleState implements DeviceState {
    public IdleState() {
        System.out.println("Device is idling\n");
    }

    @Override
    public void turnOn(Device device) {

    }

    @Override
    public void turnOff(Device device) {
        device.setState(new OffState());
    }

    @Override
    public void use(Device device) {
        device.setState(new ActiveState());
    }
}
