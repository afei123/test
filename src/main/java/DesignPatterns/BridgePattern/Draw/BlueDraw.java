package DesignPatterns.BridgePattern.Draw;

/**
 * Created by AFei on 2017/11/2.
 */
public class BlueDraw implements Draw {

    @Override
    public void draw(int length ,int weight ,int height) {
        System.out.println("A Big Blue Draw length"+length+"weight"+weight+"height"+height);
    }
}
