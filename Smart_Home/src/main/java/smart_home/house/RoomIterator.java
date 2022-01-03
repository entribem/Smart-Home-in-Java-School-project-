package smart_home.house;

import java.util.ArrayList;

/**
 *
 */
public class RoomIterator {
    private ArrayList<Room> rooms = new ArrayList<>();
    
    
    public boolean hasNext() {
       //finish Iterator
        return true;
    }
    
    public Room next() {
        //finish Iterator
        return rooms.get(0);
    }
    
    void add(Room room) {
        rooms.add(room);
    }
    
}
