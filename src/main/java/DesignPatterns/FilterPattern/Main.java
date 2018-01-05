package DesignPatterns.FilterPattern;

import DesignPatterns.FilterPattern.Criteria.CriteriaFemale;
import DesignPatterns.FilterPattern.Criteria.CriteriaMale;
import DesignPatterns.FilterPattern.Criteria.CriteriaSingle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFei on 2017/11/2.
 */
public class Main {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        CriteriaFemale criteriaFemale = new CriteriaFemale();
        CriteriaMale criteriaMale = new CriteriaMale();
        CriteriaSingle criteriaSingle = new CriteriaSingle();
        AndCriteria andCriteria = new AndCriteria(criteriaSingle, criteriaMale);
        OrCriteria orCriteria = new OrCriteria(criteriaSingle, criteriaMale);

        List<Person> andPeople = andCriteria.meetCriteria(persons);
        List<Person> orPeople = orCriteria.meetCriteria(persons);
    }
}
