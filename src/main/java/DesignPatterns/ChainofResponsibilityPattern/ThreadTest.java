package DesignPatterns.ChainofResponsibilityPattern;

import DesignPatterns.ChainofResponsibilityPattern.Logger.BaseLogger;
import DesignPatterns.ChainofResponsibilityPattern.Logger.Logger;

/**
 * Created by AFei on 2017/11/17.
 */
public class ThreadTest implements Runnable {
    @Override
    public void run() {
        BaseLogger logger = null;
        for (int i = 0 ; i < 10000 ;i++) {
            logger = LoggerDemo.getLogger();
        logger.logMessage(Logger.ERROR,"500服务器异常"+ Thread.currentThread().getName());
        /*logger.logMessage(Logger.DEBUG,"断点调试");
        logger.logMessage(Logger.BASE,"成功写入了文件");*/
        }
    }
}
