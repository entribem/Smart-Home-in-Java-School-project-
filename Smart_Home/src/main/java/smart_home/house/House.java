package smart_home.house;

import java.util.ArrayList;

public class House {
    private int floorCount;
    private int skiCount;
    private int bikeCount;
    private int carCount;
    private static House INSTANCE;
    
    private RoomIterator rooms = new RoomIterator();

    private House() {

    }

    public static House getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new House();
        }
        return INSTANCE;
    }

    public void setSkiCount(int skiCount) {
        this.skiCount = skiCount;
    }

    public void setBikeCount(int bikeCount) {
        this.bikeCount = bikeCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
    
    public int getSkiCount() {
        return skiCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public int getCarCount() {
        return carCount;
    }
    
    public int getBikeCount() {
        return bikeCount;
    }
    
    void addRoom(Room room) {
        rooms.add(room);
    }

}
