package smart_home;

import java.util.EnumSet;

import smart_home.animal.Animal;
import smart_home.animal.AnimalFactory;
import smart_home.animal.AnimalType;
import smart_home.device.DeviceType;
import smart_home.house.House;
import smart_home.house.HouseBuilder;
import smart_home.house.Room;
import smart_home.house.RoomType;

import smart_home.people.*;
import smart_home.people.Alive;

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
        
        Person dad = PeopleFactory.insertPerson(PeopleType.FATHER, bedroom1, active);
        Person mom = PeopleFactory.insertPerson(PeopleType.MOTHER, bedroom1, active);
        Person casualSon = PeopleFactory.insertPerson(PeopleType.SON, gamingLounge, active);
        Person wierdSon = PeopleFactory.insertPerson(PeopleType.SON, wc, active);
        Person casualDaughter = PeopleFactory.insertPerson(PeopleType.DAUGHTER, kitchen, active);
        Person wierdDaughter = PeopleFactory.insertPerson(PeopleType.DAUGHTER, bedroom2, active);
        //Initialize Animals
        Animal cuteCat = AnimalFactory.insertAnimal(AnimalType.CAT, bedroom1, active);
        Animal cuterCat = AnimalFactory.insertAnimal(AnimalType.CAT, gamingLounge, active);
        Animal sussyDog = AnimalFactory.insertAnimal(AnimalType.DOG, bathroom, active);
        
        //Initialize Entities
        //fix documentation???
        Device smallTv = DeviceFactory.insertDevice(DeviceType.TV, 1, wc);
        Device bigTv = DeviceFactory.insertDevice(DeviceType.TV, 4, kitchen);
        Device gamingTv = DeviceFactory.insertDevice(DeviceType.TV, 3, bedroom2);
        Device wierdTv = DeviceFactory.insertDevice(DeviceType.TV, 2, bedroom2);
        Device susTv = DeviceFactory.insertDevice(DeviceType.TV, 2, bedroom2);
        Device kawaiiTv = DeviceFactory.insertDevice(DeviceType.TV, 3, bedroom1);
        Device hdrTv = DeviceFactory.insertDevice(DeviceType.TV, 5, bedroom2);
        Device oledTv = DeviceFactory.insertDevice(DeviceType.TV, 1, bedroom2);
        Device oldTv = DeviceFactory.insertDevice(DeviceType.TV, 2, bedroom2);
        Device monitor = DeviceFactory.insertDevice(DeviceType.TV, 4, bedroom2);
        Device gamingMonitor = DeviceFactory.insertDevice(DeviceType.TV, 5, bedroom2);
        Device laptopMonitor = DeviceFactory.insertDevice(DeviceType.TV, 3, bedroom2);
        Device tv1 = DeviceFactory.insertDevice(DeviceType.TV, 4, bedroom2);
        Device tv2 = DeviceFactory.insertDevice(DeviceType.TV, 2, bedroom2);
        Device stove = DeviceFactory.insertDevice(DeviceType.STOVE, 3, bedroom2);
        Device largeFridge = DeviceFactory.insertDevice(DeviceType.FRIDGE, 2, bedroom2);
        Device smallFridge = DeviceFactory.insertDevice(DeviceType.FRIDGE, 2, bedroom2);
        Device washer = DeviceFactory.insertDevice(DeviceType.WASHER, 3, bedroom2);
        Device oven = DeviceFactory.insertDevice(DeviceType.OVEN, 6, bedroom2);
        Device microWave = DeviceFactory.insertDevice(DeviceType.MICROWAVE, 4, bedroom2);
        
        //Choosing events
        Event events = new EventChoice.stormEvent().floodEvent().blizzardEvent().build();
        
        //Clock Simulate
        Simulation sim = new Simulation(6, 2, 2020, house, events); 
        sim.simulateYear();
        
        //Generate Reports
        Report.generateAllReports();
        
    }
    
}
