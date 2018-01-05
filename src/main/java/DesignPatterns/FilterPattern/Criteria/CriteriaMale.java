package DesignPatterns.FilterPattern.Criteria;

import DesignPatterns.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFei on 2017/11/2.
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        ArrayList<Person> peopleMale = new ArrayList<>();
        personList.forEach(m->{
            if(m.getGender().equalsIgnoreCase("male")){
                peopleMale.add(m);
            }
        });
        return peopleMale;
    }
}
