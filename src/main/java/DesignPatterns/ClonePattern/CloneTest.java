package DesignPatterns.ClonePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * Created by AFei on 2017/10/11.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CloneTest implements Cloneable,Serializable {
    //虽然克隆后，两个对象String的引用指向的是同一个内存地址，但是如果给克隆后的对象的String属性改变值，
    // 那么相当于是在内存中重新开辟了一块内存来存储这个改变的值，而此时的String属性对象就指向了该内存值，
    // 所以这个时候克隆前和克隆后对象的String属性是不一样的
    private String string;

    private Common common;

    private List<Common> commonList;

    private int i ;

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
