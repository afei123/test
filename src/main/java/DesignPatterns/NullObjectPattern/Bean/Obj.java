package DesignPatterns.NullObjectPattern.Bean;

import lombok.Data;

/**
 * Created by AFei on 2017/12/11.
 */
@Data
public abstract class Obj {
    protected String name;
    public abstract boolean isNull();
}
