package smart_home.house;

import java.util.ArrayList;

/**
 *
 */
public class RoomIterator implements Iterator {
    private ArrayList<Room> rooms = new ArrayList<>();
    int currentIndex = 0;

    public boolean hasNext() {
        return currentIndex < rooms.size();
    }
    
    public Room next() {
        if (hasNext()) {
            return rooms.get(currentIndex++);
        }
        return null;
    }
    
    void add(Room room) {
        rooms.add(room);
    }
}
