package DesignPatterns.NullObjectPattern;

import DesignPatterns.NullObjectPattern.Bean.Obj;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AFei on 2017/12/11.
 */
public class Main {
    private static final String realObjPath = "DesignPatterns.NullObjectPattern.Bean.RealObj";
    private static final String nullObjPath = "DesignPatterns.NullObjectPattern.Bean.NullObj";
    private static Map<String , Obj> map = new HashMap<>();
    private static Obj nullObj = BeanFactory.getObjByClassName(nullObjPath,"没有");

    static{
        Obj nihao = BeanFactory.getObjByClassName(realObjPath, "nihao");
        map.put(nihao.getName(),nihao);
    }

    public static void main(String[] args){
        String[] arr = new String[]{"nihao","test"};
        for (String test : arr) {
            System.out.println(get(test).getName());
        }
    }
    public static Obj get(String name){
        if(map.keySet().contains(name)){
            return map.get(name);
        }
        return nullObj;
    }
}
