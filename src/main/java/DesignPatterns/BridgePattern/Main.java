package DesignPatterns.BridgePattern;

import DesignPatterns.BridgePattern.Draw.BlueDraw;

/**
 * Created by AFei on 2017/11/2.
 */
public class Main {
    public static void main(String[] args){
        Connection connection = new ExtendConnection(2, 3, 4, new BlueDraw());
        connection.draw();
    }
}
