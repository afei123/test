package DesignPatterns.porxyPattern;

/**
 * Created by AFei on 2017/11/16.
 */
public class ProxyShare implements ShareInt {
    private ShareInt shareInt;
    @Override
    public void test() {
        if(shareInt == null){
            shareInt = new RedShare();
        }
        shareInt.test();
        System.out.println("代理成功哦耶");
    }
}
