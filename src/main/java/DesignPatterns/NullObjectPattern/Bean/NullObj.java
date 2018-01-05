package DesignPatterns.NullObjectPattern.Bean;

/**
 * Created by AFei on 2017/12/11.
 */
public class NullObj extends Obj {

    @Override
    public String getName(){
        return "这是一个空对象";
    }
    @Override
    public boolean isNull() {
        return false;
    }
}
