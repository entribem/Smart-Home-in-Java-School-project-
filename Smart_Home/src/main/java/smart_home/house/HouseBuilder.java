package smart_home.house;

public class HouseBuilder {
    private int floorCount;
    private int skiCount;
    private int bikeCount;
    private int carCount;
   // House house;

    public HouseBuilder(int floorCount) {
        this.floorCount = floorCount;
    }

    public HouseBuilder setFloorCount(int floorCount) {
        this.floorCount = floorCount;
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
    
    public HouseBuilder setCarCount(int carCount) {
        this.carCount = carCount;
        return this;
    }

    public House build() {
        House house = House.getInstance();
        house.setBikeCount(this.bikeCount);
        house.setSkiCount(this.skiCount);
        house.setCarCount(this.carCount);
        return house;
    }
}
