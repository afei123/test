package DesignPatterns.FlyweightPattern;

import DesignPatterns.FlyweightPattern.Border.SolidBorder;
import DesignPatterns.FlyweightPattern.Color.Color;
import DesignPatterns.FlyweightPattern.Color.ColorFactory;

/**
 * Created by AFei on 2017/11/16.
 */
public class Main {
    public static void main(String[] args){
        Color red = ColorFactory.createColor("red");
        ExtendConnection extendConnection = new ExtendConnection(red, new SolidBorder());
        extendConnection.drowBorder();
    }
}
