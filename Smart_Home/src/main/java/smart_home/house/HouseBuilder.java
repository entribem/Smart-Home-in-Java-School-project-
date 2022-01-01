package smart_home.house;

public class HouseBuilder {
    private int floorCount;
    private int roomCount;
    private int peopleCount;
    private int animalCount;
    private int deviceCount;
    private int deviceTypeCount;
    private int skiCount;
    private int bikeCount;
   // House house;

    public HouseBuilder(int floorCount) {
        this.floorCount = floorCount;
    }

    public HouseBuilder setFloorCount(int floorCount) {
        this.floorCount = floorCount;
        return this;
    }

    public HouseBuilder setRoomCount(int roomCount) {
        this.roomCount = roomCount;
        return this;
    }

    public HouseBuilder setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
        return this;
    }

    public HouseBuilder setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
        return this;
    }

    public HouseBuilder setDeviceCount(int deviceCount) {
        this.deviceCount = deviceCount;
        return this;
    }

    public HouseBuilder setDeviceTypeCount(int deviceTypeCount) {
        this.deviceTypeCount = deviceTypeCount;
        return this;
    }

    public HouseBuilder setSkiCount(int skiCount) {
        this.skiCount = skiCount;
        return this;
    }

    public HouseBuilder setBikeCount(int bikeCount) {
        this.bikeCount = bikeCount;
        return this;
    }

    public House build() {
        House house = House.getInstance();
        house.setRoomCount(this.roomCount);
        house.setAnimalCount(this.animalCount);
        house.setBikeCount(this.bikeCount);
        house.setDeviceCount(this.deviceCount);
        house.setSkiCount(this.skiCount);
        house.setPeopleCount(this.peopleCount);
        house.setDeviceTypeCount(this.deviceTypeCount);
        return house;
    }
}
