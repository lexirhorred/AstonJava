package homework1;

public class House {
    static int totalHouses;
    private final String address;
    private final int numberOfFloors;
    private double totalArea;
    private double livingArea;
    int price;

    static {
        totalHouses = 0;
    }

    {
        price = 0;
    }

    public House(String address, int numberOfFloors) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String address, int numberOfFloors, double totalArea, double livingArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
        this.livingArea = livingArea;
        totalHouses++;
    }

    public House(String address, int numberOfFloors, double totalArea, double livingArea, int price) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
        this.livingArea = livingArea;
        this.price = price;
        totalHouses++;
    }

    public void setFields(double totalArea, double livingArea) {
        if (totalArea > 0 && livingArea > 0) {
            if (livingArea <= totalArea) {
                this.totalArea = totalArea;
                this.livingArea = livingArea;
            } else throw new IllegalArgumentException("Жилая площадь не может быть больше площади общей.");
        } else throw new IllegalArgumentException("Площадь не может быть отрицательной.");
    }

    public void setFields(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Цена не может быть отрицательной.");
        }
    }

    public static int getTotalHouses() {
        return totalHouses;
    }

    @Override
    public String toString() {
        return "Адрес: " + address +
                ". Количество этажей: " + numberOfFloors +
                ". Площадь дома: " + totalArea +
                ". Жилая площадь: " + livingArea +
                ". Цена: " + price;
    }
}
