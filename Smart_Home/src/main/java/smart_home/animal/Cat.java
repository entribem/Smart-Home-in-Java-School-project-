package smart_home.animal;

import smart_home.house.Room;
import smart_home.people.Activities;

import java.util.EnumSet;

public class Cat extends Animal {
    public Cat(Room room, EnumSet<Activities> active) {
        this.room = room;
        this.active = active;
    }
}
