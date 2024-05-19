package homework2.task1;

public class Truck extends Car {
    private final int maxLoadCapacity;

    public Truck(int maxLoadCapacity, int numberOfDoors, int trunkCapacity, String fuelType) {
        this.maxLoadCapacity = maxLoadCapacity;
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
    }

    public int getMaxLoadCapacity() {
        return this.maxLoadCapacity;
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
