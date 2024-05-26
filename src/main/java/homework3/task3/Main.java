package homework3.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strList = new ArrayList<>();
        String word;

        for (int i = 0; i < 3; ++i) {
            System.out.print("Введите строку " + i + ": ");
            strList.addLast(sc.nextLine());
        }

        word = findWord(strList);
        if (!word.isEmpty()) {
            System.out.println("Первое слово, состоящее только из различных символов: " + findWord(strList));
        } else {
            System.out.println("Нет слов, состоящих только из различных символов.");
        }
    }

    private static String findWord(List<String> strList) {
        for (String str : strList) {
            for (String word : str.split(" ")) {
                if (isOnlyDifferentCharWord(word)) {
                    return word;
                }
            }
        }

        return "";
    }

    private static boolean isOnlyDifferentCharWord(String word) {
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        for (Character chr : word.toCharArray()) {
            if (!charSet.add(chr)) {
                return false;
            }
        }

        return true;
    }
}
