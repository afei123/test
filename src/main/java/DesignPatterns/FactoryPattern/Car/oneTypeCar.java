package DesignPatterns.FactoryPattern.Car;

import lombok.Data;

/**
 * Created by AFei on 2017/10/9.
 */
@Data
public class oneTypeCar implements car {
    @Override
    public void runStyle() {
        System.out.println(getClass().getName()+"奔跑方式");
    }
}
