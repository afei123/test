package DesignPatterns.FactoryPattern.Enum;

/**
 * Created by AFei on 2017/10/10.
 */
public enum ColorTypeEnum {
    oneTypeColor("DesignPatterns.FactoryPattern.Color.red"),
    twoTypeColor("DesignPatterns.FactoryPattern.Color.blue");

    private String ColorUrl;

    ColorTypeEnum(String ColorUrl) {
        this.ColorUrl = ColorUrl;
    }

    public String getColorUrl(){
        return this.ColorUrl;
    }
}
