package homework4.task2;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>(Arrays.asList("Russia", "China", "USA"));

        countries.addFirst("India");
        countries.addFirst("Netherlands");
        countries.addLast("Japan");
        countries.addLast("Germany");
        printCollection(countries);

        countries.removeFirst();
        countries.removeLast();

        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());
    }

    private static void printCollection(LinkedList<String> countries) {
        for (String str : countries) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
