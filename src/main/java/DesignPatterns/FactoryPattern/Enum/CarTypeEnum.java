package DesignPatterns.FactoryPattern.Enum;

/**
 * Created by AFei on 2017/10/9.
 */
public enum CarTypeEnum {
    ONE_TYPE_CAR("DesignPatterns.FactoryPattern.Car.oneTypeCar"),
    TWO_TYPE_CAR("DesignPatterns.FactoryPattern.Car.twoTypeCar");

    private String url;

    CarTypeEnum(String url) {
        this.url = url;
    }

    public String getCarUrl(){
        return this.url;
    }
}
