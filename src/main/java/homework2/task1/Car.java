package homework2.task1;

public abstract class Car implements Vehicle {
    protected int numberOfDoors;
    protected int trunkCapacity;
    protected String fuelType;

    public abstract int getNumberOfDoors();
    public abstract int getTrunkCapacity();

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car is turned off.");
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
