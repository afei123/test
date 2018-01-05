package DesignPatterns.ChainofResponsibilityPattern.Logger;

/**
 * Created by AFei on 2017/11/17.
 */
public class ExceptionLogger extends Logger {
    public ExceptionLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String messsage){
        System.out.println("ExceptionLogger:: "+ messsage);
    }
}
