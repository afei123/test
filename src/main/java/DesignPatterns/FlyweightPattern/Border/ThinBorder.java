package DesignPatterns.FlyweightPattern.Border;

import DesignPatterns.FlyweightPattern.Color.Color;

/**
 * Created by AFei on 2017/11/16.
 */
public class ThinBorder implements Border {
    @Override
    public void drowBorder(Color color) {
        System.out.println("我是细线"+color.getColorName());
    }
}
