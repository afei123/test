package DesignPatterns.BridgePattern;

import DesignPatterns.BridgePattern.Draw.Draw;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by AFei on 2017/11/2.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Connection {

    protected Draw draw;

    public void draw(){}
}
