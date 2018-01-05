package DesignPatterns.FactoryPattern;

import DesignPatterns.FactoryPattern.Car.car;
import DesignPatterns.FactoryPattern.Color.Color;
import DesignPatterns.FactoryPattern.Enum.CarTypeEnum;
import DesignPatterns.FactoryPattern.Enum.ColorTypeEnum;
import DesignPatterns.FactoryPattern.Factory.CreateFactory;
import DesignPatterns.FactoryPattern.Factory.TestFactory;

import java.util.ArrayList;


/**
 * Created by AFei on 2017/10/9.
 */
public class Main {
    public static void main(String[] args){
        CreateFactory createFactory = new CreateFactory();
        ArrayList<CarTypeEnum> CarTypeEnums = new ArrayList<>();
        CarTypeEnums.add(CarTypeEnum.ONE_TYPE_CAR);
        CarTypeEnums.add(CarTypeEnum.TWO_TYPE_CAR);
        ArrayList<ColorTypeEnum> ColorTypeEnums = new ArrayList<>();
        ColorTypeEnums.add(ColorTypeEnum.oneTypeColor);
        ColorTypeEnums.add(ColorTypeEnum.twoTypeColor);
        for(int i = 0 ; i < CarTypeEnums.size() ; i++){
            TestFactory TestFactory = new TestFactory();
            car car = TestFactory.getCar(CarTypeEnums.get(i));
            Color Color = TestFactory.getColor(ColorTypeEnums.get(i));
            car.runStyle();
            Color.getCarColor();
        }
        ArrayList<Object> objects = new ArrayList<>();
        createFactory.getCar(CarTypeEnum.ONE_TYPE_CAR);
    }
}
