package smart_home.animal;

import smart_home.house.Room;
import smart_home.people.Activities;

import java.util.EnumSet;

public class Dog extends Animal {
    public Dog(Room room, EnumSet<Activities> active) {
        this.room = room;
        this.active = active;
    }
}
