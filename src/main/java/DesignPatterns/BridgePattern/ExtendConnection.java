package DesignPatterns.BridgePattern;

import DesignPatterns.BridgePattern.Draw.Draw;

/**
 * Created by AFei on 2017/11/2.
 */
public class ExtendConnection extends Connection {
    private int length , weight , height;

    public ExtendConnection(){};

    public ExtendConnection(int length, int weight, int height, Draw draw) {
        super(draw);
        this.length = length;
        this.weight = weight;
        this.height = height;
    }

    public void draw(){
        draw.draw(length,weight,height);
    }
}
