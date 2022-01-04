package smart_home.people;

import smart_home.house.Room;

import java.util.EnumSet;

/**
 *
 */
public abstract class Person {
    protected boolean doingSport;
    protected Room room;
    protected EnumSet<Activities> active;

    public void doSport() {
        doingSport = true;
    }

    //add activities and implement sport
    
}
