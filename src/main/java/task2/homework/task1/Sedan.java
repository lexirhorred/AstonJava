package task2.homework.task1;

public class Sedan extends Car {
    private final String luxuryLevel;


    public Sedan(String luxuryLevel, int numberOfDoors, int trunkCapacity, String fuelType) {
        this.luxuryLevel = luxuryLevel;
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
    }

    public String getLuxuryLevel() {
        return this.luxuryLevel;
    }

    @Override
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return this.trunkCapacity;
    }
}
