package smart_home.device;

public class DeviceFactory {
    public static Device getDevice(String type, String documentation) {
        if ("TV".equalsIgnoreCase(type)) {
            return new TV(documentation);
        }
        else if ("Fridge".equalsIgnoreCase(type)) {
            return new Fridge(documentation);
        }
        else if ("Washer".equalsIgnoreCase(type)) {
            return new Washer(documentation);
        }
        else if ("Oven".equalsIgnoreCase(type)) {
            return new Oven(documentation);
        }
        else if ("Microwave".equalsIgnoreCase(type)) {
            return new Microwave(documentation);
        }
        else if ("Stove".equalsIgnoreCase(type)) {
            return new Stove(documentation);
        }
        return null;
    }
}
