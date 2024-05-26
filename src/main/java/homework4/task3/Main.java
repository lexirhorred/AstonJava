package homework4.task3;

import java.util.HashSet;
import java.util.Objects;

public class Main {
    private static final HashSet<Person> persons = new HashSet<>();

    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov");
        Person p2 = new Person("Andrey", "Lovchuk");
        Person p3 = new Person("Galya", "Galicheva");
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        printCollection(persons);

        persons.remove(p1);
        persons.remove(p3);

        if (persons.contains(p2)) {
            System.out.println("Объект содержится в коллекции.");
        } else {
            System.out.println("Объект отсутствует в коллекции.");
        }
    }

    private static void printCollection(HashSet<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
