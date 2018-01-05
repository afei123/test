package DesignPatterns.FactoryPattern.Car;

/**
 * Created by AFei on 2017/10/9.
 */
public class twoTypeCar implements car {
    public void runStyle() {
        System.out.println(getClass().getName()+"奔跑方式");
    }
}
