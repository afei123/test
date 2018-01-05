package DesignPatterns.SingletonPattern;

/**
 * Created by AFei on 2017/12/5.
 */
public class Main {
    public static void main(String[] args){
        Dome dome1 = lazyUtils.getDome1();
        System.out.println(dome1);
        System.out.println(lazyUtils.getDome1());
        System.out.println(lazyUtils.getTestDome());
    }

}
