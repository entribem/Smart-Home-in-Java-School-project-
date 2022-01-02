package smart_home;

import smart_home.house.House;
import smart_home.house.HouseBuilder;

import smart_home.reports.Report;

/**
 * Class SmartHome creates a simulation of a family living in a smart home.
 * @author Petr Tuma, Mikhail Nalutka
 */
public class SmartHome {
    
    public static void main() {
        
        //Create House
        House house = new HouseBuilder(2).setPeopleCount(6).setAnimalCount(3).setDeviceTypeCount(8).
                setDeviceCount(20).setRoomCount(6).setSkiCount(1).setBikeCount(2).build();
        
        //Initialize People
        
        //Initialize Entities
        
        //Clock Simulate
        
        //Generate Reports
        Report report = new Report();
        report.generateAllReports();
        
    }
    
}
