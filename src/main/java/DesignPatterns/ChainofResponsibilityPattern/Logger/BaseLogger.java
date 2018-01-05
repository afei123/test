package DesignPatterns.ChainofResponsibilityPattern.Logger;

/**
 * Created by AFei on 2017/11/17.
 */
public class BaseLogger extends Logger {
    public BaseLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String message){
        System.out.println("baseLogger::"+message);
    }
}
