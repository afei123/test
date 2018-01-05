package DesignPatterns.FlyweightPattern.Color;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AFei on 2017/11/16.
 */
public class ColorFactory {
    private static Map<String,Color> colorMap = new HashMap<>();

    public static Color createColor(String colorName){
        Color color = colorMap.get(colorName);
        if(color != null){
            return color;
        }else {
            synchronized (ColorFactory.class) {
                Color synColor = colorMap.get(colorName);
                if(synColor != null){
                    return synColor;
                }
                Color newColor = new Color(colorName);
                colorMap.put(colorName, newColor);
                return newColor;
            }
        }
    }
}
