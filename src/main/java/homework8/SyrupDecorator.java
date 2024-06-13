package homework8;

public class SyrupDecorator extends BaseDecorator {
    public SyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return this.wrap.getDescription() + " With syrup.";
    }

    @Override
    public double getCost() {
        return this.wrap.getCost() + 100;
    }
}
