package DesignPatterns.FactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Car.car;
import DesignPatterns.FactoryPattern.Color.Color;
import DesignPatterns.FactoryPattern.Enum.CarTypeEnum;
import DesignPatterns.FactoryPattern.Enum.ColorTypeEnum;

/**
 * Created by AFei on 2017/10/11.
 */
public class TestFactory extends AbstractFactory {
    @Override
    public car getCar(CarTypeEnum CarTypeEnum) {
        try {
            return (car) getObj(CarTypeEnum.getCarUrl());
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public Color getColor(ColorTypeEnum ColorTypeEnum) {
        try{
            return (Color)getObj(ColorTypeEnum.getColorUrl());
        }catch (Exception e){

        }
        return null;
    }
}
