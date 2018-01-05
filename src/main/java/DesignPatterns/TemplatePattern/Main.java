package DesignPatterns.TemplatePattern;

import DesignPatterns.TemplatePattern.Template.OneTemplate;

/**
 * Created by AFei on 2017/12/22.
 */
public class Main {
    public static void main(String[] args){
        String template = new OneTemplate().getTemplate();
        System.out.println(template);
    }

    public static void example(){
        //ThreadPoolExecutor 中在模板方法中runWorker中提供基本方法beforeExecute和afterExecute供子类实现
    }
}
