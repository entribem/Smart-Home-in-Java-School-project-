package smart_home.house;

public class House {
    private int floorCount;
    private int roomCount;
    private int peopleCount;
    private int animalCount;
    private int deviceCount;
    private int deviceTypeCount;
    private int skiCount;
    private int bikeCount;
    private static House INSTANCE;

    private House() {

    }

    public static House getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new House();
        }
        return INSTANCE;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public void setSkiCount(int skiCount) {
        this.skiCount = skiCount;
    }

    public void setDeviceTypeCount(int deviceTypeCount) {
        this.deviceTypeCount = deviceTypeCount;
    }

    public void setDeviceCount(int deviceCount) {
        this.deviceCount = deviceCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }


    public void setBikeCount(int bikeCount) {
        this.bikeCount = bikeCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public int getDeviceCount() {
        return deviceCount;
    }

    public int getDeviceTypeCount() {
        return deviceTypeCount;
    }

    public int getSkiCount() {
        return skiCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public int getBikeCount() {
        return bikeCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }
}
