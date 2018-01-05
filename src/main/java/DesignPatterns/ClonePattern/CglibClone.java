package DesignPatterns.ClonePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by AFei on 2017/10/31.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CglibClone {
    private String stringt;

    private Common common;

    private List<Common> commonList;

    private int i ;
}
