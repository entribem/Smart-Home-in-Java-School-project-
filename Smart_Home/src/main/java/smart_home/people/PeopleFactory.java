package smart_home.people;

import java.util.EnumSet;

import smart_home.house.Room;

/**
 *
 */
public class PeopleFactory {
    public static Person insertPerson(PeopleType person, Room room, EnumSet<Activities> active) {
        switch (person) {
            case FATHER:
                return new Father(room, active);
            case MOTHER:
                return new Mother(room, active);
            case SON:
                return new Son(room, active);
            case DAUGHTER:
                return new Daughter(room, active);
            default:
                System.err.println("Unknown person!");
                return null;
        }
    }
}
