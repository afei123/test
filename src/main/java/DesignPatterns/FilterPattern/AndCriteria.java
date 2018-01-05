package DesignPatterns.FilterPattern;

import DesignPatterns.FilterPattern.Criteria.Criteria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by AFei on 2017/11/2.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> peopleList = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(peopleList);
    }
}
