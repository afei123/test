package DesignPatterns.FilterPattern.Criteria;

import DesignPatterns.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFei on 2017/11/2.
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        ArrayList<Person> peopleSingle = new ArrayList<>();
        personList.forEach(m->{
            if(m.getMaritalStatus().equalsIgnoreCase("single")){
                peopleSingle.add(m);
            }
        });
        return peopleSingle;
    }
}
