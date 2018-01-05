package DesignPatterns.TemplatePattern.Template;

/**
 * Created by AFei on 2017/12/22.
 */
public class OneTemplate extends AbstractTemplate {
    @Override
    protected void beforeTemplate(StringBuffer str){
        str.insert(0,"Hi ");
    }
    @Override
    protected void afeterTemplate(StringBuffer str){
        str.append(" xiaoming");
    }
}
