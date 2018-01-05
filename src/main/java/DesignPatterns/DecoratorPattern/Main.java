package DesignPatterns.DecoratorPattern;

/**
 * Created by AFei on 2017/11/2.
 */
public class Main {
    public static void main(String[] args){
        oneShare oneShare = new oneShare();
        twoShare twoShare = new twoShare();
        twoShare.setShare(oneShare);
        twoShare.drow();
    }
}
