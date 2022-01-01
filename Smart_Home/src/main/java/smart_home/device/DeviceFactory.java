package smart_home.device;

public class DeviceFactory {
    public static Device getDevice(String type, int consumption, String documentation) {
        if ("TV".equalsIgnoreCase(type)) {
            return new TV(consumption, documentation);
        }
        else if ("Fridge".equalsIgnoreCase(type)) {
            return new Fridge(consumption, documentation);
        }
        else if ("Washer".equalsIgnoreCase(type)) {
            return new Washer(consumption, documentation);
        }
        else if ("Oven".equalsIgnoreCase(type)) {
            return new Oven(consumption, documentation);
        }
        else if ("Microwave".equalsIgnoreCase(type)) {
            return new Microwave(consumption, documentation);
        }
        else if ("Stove".equalsIgnoreCase(type)) {
            return new Stove(consumption, documentation);
        }
        return null;
    }
}
