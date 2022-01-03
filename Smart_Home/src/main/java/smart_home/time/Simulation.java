package smart_home.time;

import smart_home.Event;
import smart_home.house.House;

/**
 *
 */
public class Simulation {
    private final String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private final int[] DaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    private int day;
    private int month;
    private int year;
    
    public Simulation(int day, int month, int year, House house, Event events) {        
        month %= 12;
        day %= DaysInMonth[month];
        this.day = day;
        this.month = month;
        this.year = year;        
    }
    
    //room iterator?
    
    // event iterator
    
    public static void simulateDay() {
        //check Event iterator, vezmi pravdepodobnost a
        
        //check room iterator, projdi lidi, ty co nejsou zamestnany, zamestnej
            // nahodne pickni nejakou metodu ------------------------------------------->nakonec
        
        //check devicy, updateData (spotreba)
        
        //rozbiti event?
        
        
       /* this.day++; /////////////////vyresit to at to neni infinite cycle
        
        while (Event) {
            
        }
        while (person){
            
        }
        while animal{
            
        }
        while device {
            
        }*/
    }
    
    public void simulateMonth() {
        for (int i = this.day; i < DaysInMonth[this.month]; i++) {
            simulateDay();
        }
    }
    
    public void simulateYear() {
        for (int i = this.month; i < this.months.length; i++) {
            simulateMonth();
        }
    }
        
}
