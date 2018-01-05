package DesignPatterns.TemplatePattern.Template;

/**
 * Created by AFei on 2017/12/22.
 */
public class AbstractTemplate {
    public String getTemplate(){
        StringBuffer str = new StringBuffer("nihao");
        beforeTemplate(str);
        afeterTemplate(str);
        return str.toString();
    }

    protected void beforeTemplate(StringBuffer str){}

    protected void afeterTemplate(StringBuffer str){}
}
