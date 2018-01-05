package DesignPatterns.CommandPattern;

/**
 * Created by AFei on 2017/11/17.
 */
public class NormalMain {
    public static void main(String[] args){
        Stock stock = new Stock("eat","run");
        normal(stock);
    }

    private static void normal(Stock stock) {
        stock.eat();
        stock.run();
    }
}
