package homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our coffee shop. Here is our menu: ");
        System.out.println("\t1. Just coffee");
        System.out.println("\t2. Coffee with milk");
        System.out.println("\t3. Coffee with syrup");
        System.out.println("\t4. Coffee with milk and syrup");
        System.out.print("Enter the number of the coffee you have selected: ");

        Coffee myCoffee = new SimpleCoffee();
        myCoffee = switch (new Scanner(System.in).nextInt()) {
            case 2 -> new MilkDecorator(myCoffee);
            case 3 -> new SyrupDecorator(myCoffee);
            case 4 -> {
                myCoffee = new MilkDecorator(myCoffee);
                yield new SyrupDecorator(myCoffee);
            }
            default -> myCoffee;
        };
        System.out.println("\nYour choice: " + myCoffee.getDescription() +
                " Cost: " + myCoffee.getCost());
    }
}
