package smart_home.people;

import smart_home.house.Room;

import java.util.EnumSet;

public class Father extends Person {
    public Father(Room room, EnumSet<Activities> active) {
        this.room = room;
        this.active = active;
    }
}
