package smart_home;

import java.util.EnumSet;

import smart_home.house.House;
import smart_home.house.HouseBuilder;
import smart_home.house.Room;
import smart_home.house.RoomType;

import smart_home.people.Person;
import smart_home.people.Animal;
import smart_home.people.Alive;
import smart_home.people.AliveFactory;
import smart_home.people.Activities;

import smart_home.device.Device;
import smart_home.device.DeviceFactory;

import smart_home.time.Simulation;

import smart_home.reports.Report;


/**
 * Class SmartHome creates a simulation of a family living in a smart home.
 * @author Petr Tuma, Mikhail Nalutka
 */
public class SmartHome {
    
    public static void main() {
        
        //Create House
        House house = new HouseBuilder(2).setSkiCount(1).setBikeCount(2).setCarCount(1).build();

        //Initialize Rooms
        Room kitchen = new Room(RoomType.Kitchen, house, 4);
        Room bedroom1 = new Room(RoomType.Bedroom, house, 2);
        Room bedroom2 = new Room(RoomType.Bedroom, house, 1);
        Room bathroom = new Room(RoomType.Bathroom, house, 0);
        Room wc = new Room(RoomType.Toilet, house, 0);
        Room gamingLounge = new Room(RoomType.Playroom, house, 0);
       
        //Initialize People
        EnumSet<Activities> active = new RegularEnumSet<>();//????????????????????
        active.add(Activities.PettingCat);
        
        Person dad = AliveFactory.insertPerson(Alive.Father, bedroom1, active);
        Person mom = AliveFactory.insertPerson(Alive.Mother, bedroom1, active);
        Person casualSon = AliveFactory.insertPerson(Alive.Boy, gamingLounge, active);
        Person wierdSon = AliveFactory.insertPerson(Alive.Boy, wc, active);
        Person casualDaughter = AliveFactory.insertPerson(Alive.Girl, kitchen, active);
        Person wierdDaughter = AliveFactory.insertPerson(Alive.Girl, bedroom2, active);
        //Initialize Animals
        Animal cuteCat = AliveFactory.insertAnimal(Alive.Cat, bedroom1, active);
        Animal cuterCat = AliveFactory.insertAnimal(Alive.Cat, gamingLounge, active);
        Animal sussyDog = AliveFactory.insertAnimal(Alive.Dog, bathroom, active);
        
        //Initialize Entities
        Device smallTv = DeviceFactory.getDevice("tv", 1, "Turn Off", wc);
        Device bigTv = DeviceFactory.getDevice("tv", 4, "Turn On", kitchen);
        Device gamingTv = DeviceFactory.getDevice("tv", 3, "Turn On", bedroom2);
        Device wierdTv = DeviceFactory.getDevice("tv", 2, "Turn On", bedroom2);
        Device susTv = DeviceFactory.getDevice("tv", 2, "Turn On", bedroom2);
        Device kawaiiTv = DeviceFactory.getDevice("tv", 3, "Turn On", bedroom1);
        Device hdrTv = DeviceFactory.getDevice("tv", 5, "Turn On", bedroom2);
        Device oledTv = DeviceFactory.getDevice("tv", 1, "Turn On", bedroom2);
        Device oldTv = DeviceFactory.getDevice("tv", 2, "Turn On", bedroom2);
        Device monitor = DeviceFactory.getDevice("tv", 4, "Turn On", bedroom2);
        Device gamingMonitor = DeviceFactory.getDevice("tv", 5, "Turn On", bedroom2);
        Device laptopMonitor = DeviceFactory.getDevice("tv", 3, "Turn On", bedroom2);
        Device tv1 = DeviceFactory.getDevice("tv", 4, "Turn On", bedroom2);
        Device tv2 = DeviceFactory.getDevice("tv", 2, "Turn On", bedroom2);
        Device stove = DeviceFactory.getDevice("stove", 3, "Turn On", bedroom2);
        Device largeFridge = DeviceFactory.getDevice("fridge", 2, "Turn On", bedroom2);
        Device smallFridge = DeviceFactory.getDevice("fridge", 2, "Turn On", bedroom2);
        Device washer = DeviceFactory.getDevice("washer", 3, "Turn On", bedroom2);
        Device oven = DeviceFactory.getDevice("oven", 6, "Turn On", bedroom2);
        Device microWave = DeviceFactory.getDevice("microwave", 4, "Turn On", bedroom2);
        
        //Choosing events
        Event events = new EventChoice.stormEvent().floodEvent().blizzardEvent().build();
        
        //Clock Simulate
        Simulation sim = new Simulation(6, 2, 2020, house, events); 
        sim.simulateYear();
        
        //Generate Reports
        Report.generateAllReports();
        
    }
    
}
