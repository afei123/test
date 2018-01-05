package DesignPatterns.DecoratorPattern;

/**
 * Created by AFei on 2017/11/2.
 */
public class oneShare implements Share {
    @Override
    public void drow() {
        System.out.println("oneShare");
    }
}
