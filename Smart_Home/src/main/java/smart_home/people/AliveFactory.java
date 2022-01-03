package smart_home.people;

import java.util.EnumSet;

import smart_home.house.Room;

/**
 *
 */
public class AliveFactory {
    
    public static Person insertPerson(Alive person, Room room, EnumSet<Activities> active) {
        switch (person) {
            case Father:
                return new Father(active);
                break;
            case Mother:
                return new Mother(active);
                break;
            case Boy:
                return new Boy(active);
                break;
            case Girl:
                return new Girl(active);
                break;                
            default:
                System.err.println("Try it with insertAnimal!");
                break;
        }
    }
    
    public static Animal insertAnimal(Alive animal, Room room, EnumSet<Activities> active) {
        switch (animal) {
            case Cat:
                return new Cat(active);
                break;
            case Dog:
                return new Dog(active);
                break;
            default:
                System.err.println("Try it with insertPerson!");
                break;
        }
    }
    
}
