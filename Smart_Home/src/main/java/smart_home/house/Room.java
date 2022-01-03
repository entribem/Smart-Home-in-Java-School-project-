package smart_home.house;

import static java.lang.Math.abs;

import smart_home.people.Person;
import smart_home.device.Device;

import java.util.ArrayList;

/**
 *
 */
public class Room {
    private final RoomType type;
    private final House house;
    private final int windowNum;
    
    private ArrayList<Person> people = new ArrayList<>();
    private ArrayList<Device> devices = new ArrayList<>();
   
    //add person
    //add device
    
    public Room(RoomType type, House house, int windowNum) {
        this.type = type;
        this.house = house;
        this.windowNum = abs(windowNum);
        this.house.addRoom(this);
    }
    
}
