package smart_home.people;

import smart_home.house.Room;

import java.util.EnumSet;

public class Daughter extends Person {
    public Daughter(Room room, EnumSet<Activities> active) {
        this.room = room;
        this.active = active;
    }
}
