package DesignPatterns.CommandPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by AFei on 2017/11/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    private String eat;
    private String run;

    public void eat(){
        System.out.println(eat);
    }
    public void run(){
        System.out.println(run);
    }
}
