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
public class OrCriteria implements Criteria {
    private Criteria criteria;

    private Criteria otherCriteria;
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(personList);
        List<Person> twoCriteriaItems = otherCriteria.meetCriteria(personList);
        twoCriteriaItems.forEach(m->{
            if(!firstCriteriaItems.contains(m)){
                firstCriteriaItems.add(m);
            }
        });
        return firstCriteriaItems;
    }
}
