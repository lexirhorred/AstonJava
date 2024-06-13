package homework8;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Just coffee.";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
