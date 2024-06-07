package homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Buyer extends Thread implements IBuyer, IUseBasket {
    private final Random rnd = new Random();
    private final Map<Good, Integer> goodsMap;

    public Buyer(Map<Good, Integer> goodsMap) {
        this.goodsMap = goodsMap;
    }

    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        goOut();
    }

    @Override
    public void enterToMarket() {
//        System.out.printf("Покупатель %d пришел в магазин.\n",
//                Thread.currentThread().threadId());
    }

    @Override
    public void chooseGoods() {
//        System.out.printf("Покупатель %d делает покупки...\n",
//                Thread.currentThread().threadId());
        takeBasket();
        putGoodsToBasket();
//        System.out.printf("Покупатель %d закончил покупки.\n",
//                Thread.currentThread().threadId());
    }

    @Override
    public void goOut() {
//        System.out.printf("Покупатель %d уходит из магазина.\n",
//                Thread.currentThread().threadId());
    }

    @Override
    public void takeBasket() {
        try {
            Thread.sleep(randomMilliseconds(0.5, 2));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
//        System.out.printf("Покупатель %d взyaл корзину.\n",
//                Thread.currentThread().threadId());
    }

    @Override
    public void putGoodsToBasket() {
        final int countOfGoods = rnd.nextInt(1, 5);
        final List<Good> basket = new ArrayList<>();
        final List<Good> keys = new ArrayList<Good>(goodsMap.keySet());

        for (int i = 0; i < countOfGoods; ++i) {
            basket.addFirst(keys.get(rnd.nextInt(0, keys.size())));
            try {
                Thread.sleep(randomMilliseconds(0.5, 2));
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("Покупатель %d выбрал cледующие товары.\n",
                Thread.currentThread().threadId());
        printBasketContent(basket);
    }

    private int randomMilliseconds(double min, double max) {
        return (int) (rnd.nextDouble(min, max) * 1000);
    }

    private void printBasketContent(List<Good> basket) {
        for (Good good : basket) {
            System.out.println('\t' + "-" + good.getName());
        }
        System.out.println();
    }
}
