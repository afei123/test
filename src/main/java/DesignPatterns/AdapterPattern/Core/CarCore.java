package DesignPatterns.AdapterPattern.Core;

/**
 * Created by AFei on 2017/10/10.
 */
public class CarCore implements Core {
    @Override
    public void getCore() {
        System.out.println("小汽车的核心");
    }
}
