package DesignPatterns.DecoratorPattern;

import lombok.Data;

/**
 * Created by AFei on 2017/11/2.
 */
@Data
public class twoShare implements Share {
    private Share share;
    @Override
    public void drow() {
        share.drow();
        System.out.println("twoShare");
    }
}
