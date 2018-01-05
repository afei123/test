package DesignPatterns.FactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Car.car;
import DesignPatterns.FactoryPattern.Car.twoTypeCar;
import DesignPatterns.FactoryPattern.Color.Color;
import DesignPatterns.FactoryPattern.Color.blue;
import DesignPatterns.FactoryPattern.Enum.CarTypeEnum;
import DesignPatterns.FactoryPattern.Enum.ColorTypeEnum;

/**
 * Created by AFei on 2017/10/10.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public car getCar(CarTypeEnum CarTypeEnum) {
        return new twoTypeCar();
    }

    @Override
    public Color getColor(ColorTypeEnum ColorTypeEnum) {
        return new blue();
    }

}
