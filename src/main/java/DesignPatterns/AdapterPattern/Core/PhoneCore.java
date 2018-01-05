package DesignPatterns.AdapterPattern.Core;

/**
 * Created by AFei on 2017/10/10.
 */
public class PhoneCore implements Core {
    @Override
    public void getCore() {
        System.out.println("手机的核心");
    }
}
