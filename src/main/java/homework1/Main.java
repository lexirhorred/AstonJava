package homework1;

public class Main {
    public static void main(String[] args) {
        House house1 = new House("улица Тополиная, дом 13", 2, 150, 98);
        System.out.println(house1.toString());
        house1.setFields(11000000);
        System.out.println(house1.toString());
        house1.setFields(200, 150);
        System.out.println(house1.toString());
        house1.price = 14700000;
        System.out.println(house1.toString());
        System.out.println();

        Airplane plane = new Airplane("AeroAndina", "MXP-1000 Tayrona", 10, 15, 290);
        System.out.println(plane.toString());
        plane.setFields(350.);
        System.out.println(plane.toString());
        plane.price = 80000;
        System.out.println(plane.toString());
        plane.setFields(315, 100000);
        System.out.println(plane.toString());
        System.out.println();

        Person user1 = new Person("Андрей", 40);
        System.out.println(user1.toString());
        user1.setFields("Алексей");
        System.out.println(user1.toString());
        user1.setFields("Илья", 30);
        System.out.println(user1.toString());
        user1.age = 20;
        System.out.println(user1.toString());
    }
}