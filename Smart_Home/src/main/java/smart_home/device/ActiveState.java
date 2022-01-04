package smart_home.device;

public class ActiveState implements DeviceState {
    public ActiveState() {
        System.out.println("Device is working\n");
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

    }
}
