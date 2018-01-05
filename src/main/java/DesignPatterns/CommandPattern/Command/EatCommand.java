package DesignPatterns.CommandPattern.Command;

import DesignPatterns.CommandPattern.Stock;
import lombok.AllArgsConstructor;

/**
 * Created by AFei on 2017/11/17.
 */
@AllArgsConstructor
public class EatCommand implements Command {
    private Stock stock;
    @Override
    public void execute() {
        stock.eat();
    }
}
