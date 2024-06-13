package homework8;public class MilkDecorator extends BaseDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return wrap.getDescription() + " With milk.";
    }

    @Override
    public double getCost() {
        return wrap.getCost() + 50;
    }
}
