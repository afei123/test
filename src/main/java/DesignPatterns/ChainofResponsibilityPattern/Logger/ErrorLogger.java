package DesignPatterns.ChainofResponsibilityPattern.Logger;

/**
 * Created by AFei on 2017/11/17.
 */
public class ErrorLogger extends Logger {
    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String message){
        System.out.println("ErrorLogger:: " + message);
    }
}
