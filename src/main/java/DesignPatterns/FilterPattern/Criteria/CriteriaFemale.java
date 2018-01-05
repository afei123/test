package DesignPatterns.FilterPattern.Criteria;

import DesignPatterns.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFei on 2017/11/2.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        ArrayList<Person> peopleFemale = new ArrayList<>();
        personList.forEach(m->{
            if(m.getGender().equalsIgnoreCase("female")){
                peopleFemale.add(m);
            }
        });
        return peopleFemale;
    }
}
