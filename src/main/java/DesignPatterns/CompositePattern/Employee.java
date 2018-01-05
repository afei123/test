package DesignPatterns.CompositePattern;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFei on 2017/11/2.
 */
@Data
@ToString
@NoArgsConstructor
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates = new ArrayList<>();

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}
