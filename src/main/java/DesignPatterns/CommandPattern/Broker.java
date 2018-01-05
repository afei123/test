package DesignPatterns.CommandPattern;

import DesignPatterns.CommandPattern.Command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFei on 2017/11/17.
 */
public class Broker {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        if(command != null) {
            commandList.add(command);
        }
    }
    public void excutingOrder (){
        //具体的逻辑
        for (Command command : commandList) {
            command.execute();
        }
    }
}
