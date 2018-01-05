package DesignPatterns.SingletonPattern;

/**
 * Created by AFei on 2017/10/11.
 */
public class lazyUtils {
    private static Dome dome;
    //单例模式(懒汉)和直接new(饿汉)的区别就是在方法中可以对这个静态变量的初始化进行操作(加个线程锁,在使用的时候才去创建对象节省内存)
    private static Dome testDome = new Dome();

    public static Dome getTestDome(){
        return testDome;
    }

    //因为使用了 静态的成员变量  所以方法存在安全性问题
    //线程不安全
    public static Dome  getDome2(){
        if(dome == null){
            dome = new Dome();
        }
        return dome;
    }
    //线程安全效率慢
    public synchronized static Dome  getDome1(){
        if(dome == null){
            dome = new Dome();
        }
        return dome;
    }
    //线程安全效率快
    public static Dome  getDome3(){
        if(dome == null){
            synchronized (dome.getClass()) {
                if(dome == null) {
                    dome = new Dome();
                    dome.setI(6);
                }
            }
        }
        return dome;
    }
}
