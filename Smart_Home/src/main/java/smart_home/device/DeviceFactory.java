package smart_home.device;

import smart_home.house.Room;

public class DeviceFactory {
    public static Device insertDevice(DeviceType device, String documentation, Room room) {
        switch (device) {
            case TV:
                return new TV(documentation, room);
            case FRIDGE:
                return new Fridge(documentation, room);
            case WASHER:
                return new Washer(documentation, room);
            case OVEN:
                return new Oven(documentation, room);
            case MICROWAVE:
                return new Microwave(documentation, room);
            case STOVE:
                return new Stove(documentation, room);
            default:
                System.err.println("Unknown device!");
                return null;
        }
    }
}
