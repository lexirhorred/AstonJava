package homework2.task1;

public class Main {
    public static void main(String[] args) {
        Sedan s1 = new Sedan("Business", 4, 5, "Gasoline");
        s1.start();
        System.out.println("Fuel type: " + s1.getFuelType());
        System.out.println("Number of doors: " + s1.getNumberOfDoors());
        System.out.println("Trunk capacity: " + s1.getTrunkCapacity());
        System.out.println("Luxury level: " + s1.getLuxuryLevel());
        s1.stop();

        System.out.println();

        Truck t1 = new Truck(10000, 2, 3, "Diesel");
        t1.start();
        System.out.println("Fuel type: " + t1.getFuelType());
        System.out.println("Number of doors: " + t1.getNumberOfDoors());
        System.out.println("Trunk capacity: " + t1.getTrunkCapacity());
        System.out.println("Max load capacity: " + t1.getMaxLoadCapacity());
        t1.stop();
    }
}
