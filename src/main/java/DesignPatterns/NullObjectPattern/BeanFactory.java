package DesignPatterns.NullObjectPattern;

import DesignPatterns.NullObjectPattern.Bean.Obj;

/**
 * Created by AFei on 2017/12/11.
 */
public class BeanFactory {
    public static Obj getObjByClassName(String className,String name){
        Obj obj = null;
        try {
            Class<?> aClass = Class.forName(className);
            obj = (Obj)aClass.newInstance();
            obj.setName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
