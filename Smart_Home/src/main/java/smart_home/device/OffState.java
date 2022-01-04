package smart_home.device;

public class OffState implements DeviceState {
    public OffState() {
        System.out.println("Device is turned off\n");
    }

    @Override
    public void turnOn(Device device) {
       // device.electricityConsumption =
        device.setState(new IdleState());
    }

    @Override
    public void turnOff(Device device) {
    }

    @Override
    public void use(Device device) {
    }
}
