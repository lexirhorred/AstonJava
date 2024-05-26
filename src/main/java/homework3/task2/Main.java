package homework3.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        int avgStrLength = 0;

        inputStrings(strList);

        avgStrLength = getAvgStrLength(strList);
        for (String str : strList) {
            if (str.length() < avgStrLength) {
                System.out.println("Строка: \"" + str + "\". Длина: " + str.length() + " символов.");
            }
        }
    }

    private static void inputStrings(List<String> strList) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; ++i) {
            System.out.print("Введите строку " + i + ": ");
            strList.addLast(sc.nextLine());
        }
    }

    private static int getAvgStrLength(List<String> lst) {
        if (!lst.isEmpty()) {
            int avg = 0;
            for (String str : lst) {
                avg += str.length();
            }
            return avg /= lst.size();
        } else {
            return 0;
        }
    }
}
