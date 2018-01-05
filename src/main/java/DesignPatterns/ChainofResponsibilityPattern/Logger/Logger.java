package DesignPatterns.ChainofResponsibilityPattern.Logger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by AFei on 2017/11/16.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Logger {
    public static int BASE = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected Logger logger;
    protected int level;

    public void logMessage(int level,String message){
        if(level <= this.level){
            write(message);
            return;
        }
        if(logger != null){
            logger.logMessage(level,message);
        }
    }
    public void write(String message){
    }
}
