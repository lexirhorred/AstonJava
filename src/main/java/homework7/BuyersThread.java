package homework7;

import java.util.ArrayDeque;
import java.util.Random;

public class BuyersThread extends Thread {
    private ArrayDeque<Buyer> buyersDeque;

    public BuyersThread(String name, ArrayDeque<Buyer> buyersDeque) {
        super(name);
        this.buyersDeque = buyersDeque;
    }

    @Override
    public void run() {
        System.out.printf("%s start.", Thread.currentThread().getName());

        int end = 0;
        int totalMilliseconds = 1000 * 60 * 2;
        Random rndBuyersCount = new Random();

        while (end < totalMilliseconds) {
            try {
                Thread.sleep(1000);
                end += 1000;
                System.out.println("New buyer enter to the market.");
                for (int i = 0; i < rndBuyersCount.nextInt(3); ++i) {
//                    Buyer b = new Buyer();
                }
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted.");
            }

        }
        System.out.printf("%s finished.", Thread.currentThread().getName());
    }
}
