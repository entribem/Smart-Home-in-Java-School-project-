package smart_home.animal;

import smart_home.house.Room;
import smart_home.people.Activities;

import java.util.EnumSet;

public class AnimalFactory {
    public static Animal insertAnimal(AnimalType animal, Room room, EnumSet<Activities> active) {
        switch (animal) {
            case CAT:
                return new Cat(room, active);
            case DOG:
                return new Dog(room, active);
            default:
                System.err.println("Unknown animal!");
                return null;
        }
    }
}
