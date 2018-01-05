package DesignPatterns.ChainofResponsibilityPattern;

/**
 * Created by AFei on 2017/11/17.
 */
public class Main {
    public static void main(String[] args){
        ThreadTest threadTest = new ThreadTest();
        Thread thread = new Thread(threadTest);
        Thread thread1 = new Thread(threadTest);
        thread.start();
        thread1.start();
    }
}
