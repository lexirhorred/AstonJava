package homework8;

public class BaseDecorator implements Coffee {
    protected Coffee wrap;

    public BaseDecorator(Coffee coffee) {
        this.wrap = coffee;
    }

    @Override
    public String getDescription() {
        return wrap.getDescription();
    }

    @Override
    public double getCost() {
        return wrap.getCost();
    }
}
