package DesignPatterns.ChainofResponsibilityPattern;

import DesignPatterns.ChainofResponsibilityPattern.Logger.BaseLogger;
import DesignPatterns.ChainofResponsibilityPattern.Logger.ErrorLogger;
import DesignPatterns.ChainofResponsibilityPattern.Logger.ExceptionLogger;
import DesignPatterns.ChainofResponsibilityPattern.Logger.Logger;

/**
 * Created by AFei on 2017/11/17.
 */
public class LoggerDemo {
    public static BaseLogger baseLogger;

    public static BaseLogger getLogger(){
        if(baseLogger == null) {
            synchronized (LoggerDemo.class) {
                if(baseLogger == null) {
                    BaseLogger baseLogger = new BaseLogger(Logger.BASE);
                    ExceptionLogger exceptionLogger = new ExceptionLogger(Logger.DEBUG);
                    ErrorLogger errorLogger = new ErrorLogger(Logger.ERROR);

                    baseLogger.setLogger(exceptionLogger);
                    exceptionLogger.setLogger(errorLogger);
                    LoggerDemo.baseLogger = baseLogger;
                }
            }
        }
        return baseLogger;
    }
}
