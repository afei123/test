package DesignPatterns.FilterPattern;

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
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;
}
