package smart_home.people;

import smart_home.house.Room;

import java.util.EnumSet;

public class Mother extends Person {
    public Mother(Room room, EnumSet<Activities> active) {
        this.room = room;
        this.active = active;
    }
}
