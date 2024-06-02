package homework6.task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string for file: ");
        String inputString = sc.nextLine();

        try (FileOutputStream oStream = new FileOutputStream("tms.txt")) {
            oStream.write(inputString.getBytes());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (FileInputStream iStream = new FileInputStream("tms.txt")) {
            StringBuilder sBuilder = new StringBuilder();
            int character;
            while ((character = iStream.read()) != -1) {
                if (character == ' ') {
                    sBuilder.append('_');
                } else {
                    sBuilder.append((char) character);
                }
            }
            System.out.println(sBuilder);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
