package homework4.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Arrays.asList("Russia", "USA", "China"));

        addElemToCollection(countries);
        printCollection(countries);

        countries.set(1, "Japan");
        countries.remove(1);
        countries.remove("China");
        System.out.println("Индекс страны \"Russia\": " + countries.indexOf("Russia"));

        printCollectionElement(countries, "Germany");
    }

    private static void addElemToCollection(List<String> countries) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; ++i) {
            System.out.print("Введите название страны для добавления: ");
            countries.addLast(sc.nextLine());
        }
    }

    private static void printCollection(List<String> countries) {
        for (String str : countries) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private static void printCollectionElement(List<String> strList, String str) {
        if (strList.contains(str)) {
            System.out.println("Страна \"" + str + "\" содержится в коллекции.");
        } else {
            System.out.println("Страны \"" + str + "\" нет в коллекции.");
        }
    }
}
