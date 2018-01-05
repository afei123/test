package DesignPatterns.FactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Car.car;
import DesignPatterns.FactoryPattern.Car.oneTypeCar;
import DesignPatterns.FactoryPattern.Color.Color;
import DesignPatterns.FactoryPattern.Color.red;
import DesignPatterns.FactoryPattern.Enum.CarTypeEnum;
import DesignPatterns.FactoryPattern.Enum.ColorTypeEnum;

/**
 * Created by AFei on 2017/10/9.
 */
public class CarFactory extends AbstractFactory {
    public car getCar(CarTypeEnum CarTypeEnum){
        return new oneTypeCar();
    }

    @Override
    public Color getColor(ColorTypeEnum ColorTypeEnum) {
        return new red();
    }
}
