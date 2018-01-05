package DesignPatterns.FlyweightPattern;

import DesignPatterns.FlyweightPattern.Border.Border;
import DesignPatterns.FlyweightPattern.Color.Color;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by AFei on 2017/11/16.
 */
@Data
@NoArgsConstructor
public class ExtendConnection extends Connection {
    private Color color;

    public ExtendConnection(Color color,Border border){
        this.color = color;
        this.border = border;
    }

    public void drowBorder() {
        border.drowBorder(color);
    }
}
