package homework7;

import java.sql.Array;
import java.util.*;

public class Shop {
    static private final Map<Good, Integer> goodsMap = Map.of(
            new Good("Milk"), 70,
            new Good("Coffee"), 500,
            new Good("Soap"), 100,
            new Good("Doshirak"), 60,
            new Good("Vodka"), 800
    );

    public static void main(String[] args) {
        int timer = 0;
        int totalMilliseconds = 1000 * 60 * 2;
        Random rnd = new Random();

        while (timer < totalMilliseconds) {
            try {
                Thread.sleep(1000);
                timer += 1000;
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            int buyersCount = rnd.nextInt(3);
            for (int i = 0; i < buyersCount; ++i) {
                Buyer buyer = new Buyer(goodsMap);
                buyer.start();
            }
        }
    }
}