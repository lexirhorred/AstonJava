package homework3.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        StringBuilder strBldr = new StringBuilder();

        for (int i = 0; i < str.length(); ++i) {
            strBldr.append(str.charAt(i));
            strBldr.append(str.charAt(i));
        }

        System.out.println(strBldr);
    }
}
