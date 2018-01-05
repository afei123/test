package DesignPatterns.ClonePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by AFei on 2017/10/11.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Common implements Serializable {
    private String common;
}
