package task1.homework;

public class Airplane {
    private static String manufacturer;
    static int totalPlanes;
    private final String model;
    private final double wingspan;
    private final double liftToDragRatio;
    private double weight;
    int price;

    static {
        manufacturer = "Unknown";
        totalPlanes = 0;
    }

    {
        weight = 0;
        price = 0;
    }

    public Airplane(String model, double wingspan, double liftToDragRatio, double mass) {
        this.model = model;
        weight = mass;
        this.wingspan = wingspan;
        this.liftToDragRatio = liftToDragRatio;
        totalPlanes++;
    }

    public Airplane(String manufacturer, String model, double wingspan, double liftToDragRatio, double mass) {
        Airplane.manufacturer = manufacturer;
        this.model = model;
        weight = mass;
        this.wingspan = wingspan;
        this.liftToDragRatio = liftToDragRatio;
        totalPlanes++;
    }

    public Airplane(String model, int price, double wingspan, double liftToDragRatio, double mass) {
        this.model = model;
        this.wingspan = wingspan;
        this.liftToDragRatio = liftToDragRatio;
        weight = mass;
        this.price = price;
        totalPlanes++;
    }

    public void setFields(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Масса должа быть выше или равна 0.");
        }
    }

    public void setFields(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Стоимость не может быть меньше 0.");
        }
    }

    public void setFields(double weight, int price) {
        if (weight >= 0 && price >= 0) {
            this.weight = weight;
            this.price = price;
        } else throw new IllegalArgumentException("Вес и стоимость должны быть больше 0.");
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Производитель: " + manufacturer +
                ". Модель: " + model +
                ". Размах крыла: " + wingspan +
                ". Аэродинамическое качество: " + liftToDragRatio +
                ". Вес: " + weight + ". Цена: " + price;
    }
}