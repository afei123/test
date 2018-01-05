package DesignPatterns.porxyPattern;

/**
 * 动态代理就是高级版,跟使用反射的beanFactory差不多
 * Created by AFei on 2017/11/16.
 */
public class Main {
    public static void main(String[] args){
        ProxyShare proxy = new ProxyShare();
        proxy.test();
    }
}
