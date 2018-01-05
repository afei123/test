package DesignPatterns.CompositePattern;

import java.util.List;

/**
 * Created by AFei on 2017/11/2.
 */
public class Main {
    public static void main(String[] args){
        // jdk 中的组合模式实例  sun.plugin.dom.core.Node implement org.w3c.dom.Node
        test();
    }

    public static void test(){
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.getSubordinates().add(headSales);
        CEO.getSubordinates().add(headMarketing);

        headSales.getSubordinates().add(clerk1);
        headSales.getSubordinates().add(clerk2);

        headMarketing.getSubordinates().add(salesExecutive1);
        headMarketing.getSubordinates().add(salesExecutive2);

        print(CEO);
    }
    public static void print(Employee employee){
        System.out.println(employee.getName()+".."+employee.getDept()+".."+employee.getSalary());
        List<Employee> subordinates = employee.getSubordinates();
        if(subordinates != null && subordinates.size() > 0) {
            for (Employee employee1 : employee.getSubordinates()) {
                print(employee1);
            }
        }
    }
}
