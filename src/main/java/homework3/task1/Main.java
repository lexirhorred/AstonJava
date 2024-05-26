package homework3.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        String minStr;
        String maxStr;

        inputStrings(strList);

        minStr = getMinString(strList);
        maxStr = getMaxString(strList);
        System.out.println("Самая короткая строка: \"" + minStr + "\". Длина: " + minStr.length() + " символов.");
        System.out.println("Самая длинная строка: \"" + maxStr + "\". Длина: " + maxStr.length() + " символов.");
    }

    private static void inputStrings(List<String> strList) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; ++i) {
            System.out.print("Введите строку " + i + ": ");
            strList.addLast(sc.nextLine());
        }
    }

    private static String getMaxString(List<String> lst) {
        String maxStr = lst.getFirst();

        for (int i = 1; i < lst.size(); ++i) {
            if (maxStr.length() < lst.get(i).length()) {
                maxStr = lst.get(i);
            }
        }
        return maxStr;
    }

    private static String getMinString(List<String> lst) {
        String minStr = lst.getFirst();

        for (int i = 1; i < lst.size(); ++i) {
            if (minStr.length() > lst.get(i).length()) {
                minStr = lst.get(i);
            }
        }
        return minStr;
    }
}
