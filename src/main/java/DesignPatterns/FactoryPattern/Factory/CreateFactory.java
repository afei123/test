package DesignPatterns.FactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Car.car;
import DesignPatterns.FactoryPattern.Enum.CarTypeEnum;

/**
 * Created by AFei on 2017/10/10.
 */
public class CreateFactory {
    public car getCar(CarTypeEnum CarTypeEnum){
        try {
            return (car) Class.forName(CarTypeEnum.getCarUrl()).newInstance();
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
