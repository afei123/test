package DesignPatterns.FactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Car.car;
import DesignPatterns.FactoryPattern.Color.Color;
import DesignPatterns.FactoryPattern.Enum.CarTypeEnum;
import DesignPatterns.FactoryPattern.Enum.ColorTypeEnum;

/**
 * Created by AFei on 2017/10/10.
 */
//超级工厂是抽象类就是为了提取各个工厂中重用的代码
public abstract class AbstractFactory {
    public abstract car getCar(CarTypeEnum CarTypeEnum);
    public abstract Color getColor(ColorTypeEnum ColorTypeEnum);

    public Object getObj(String Url)throws Exception{
        return Class.forName(Url).newInstance();
    }
}
