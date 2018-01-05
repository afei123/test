package DesignPatterns.CommandPattern;

import DesignPatterns.CommandPattern.Command.EatCommand;
import DesignPatterns.CommandPattern.Command.RunCommand;

/**
 * Created by AFei on 2017/11/17.
 */
public class CommandMain {
    /**
     * 目前的理解就是外部通过指令调用内部，来修改参数或者其他什么操作
     * @param args
     */
    public static void main(String[] args){
        Stock stock = new Stock("eat", "run");
        EatCommand eatCommand = new EatCommand(stock);
        RunCommand runCommand = new RunCommand(stock);

        Broker broker = new Broker();
        broker.addCommand(eatCommand);
        broker.addCommand(runCommand);
        broker.excutingOrder();
    }
}
