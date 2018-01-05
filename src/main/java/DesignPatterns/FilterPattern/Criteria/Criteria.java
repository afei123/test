package DesignPatterns.FilterPattern.Criteria;

import DesignPatterns.FilterPattern.Person;

import java.util.List;

/**
 * Created by AFei on 2017/11/2.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> personList);
}
