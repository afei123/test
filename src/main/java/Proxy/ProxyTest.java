package Proxy;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AFei on 2017/9/19.
 */
public class ProxyTest {
    public static void main(String[] args) throws Exception{
        File nowFile = new File("");
        File dir = new File(nowFile.getCanonicalPath() + "\\src");
        getFieldList(dir);
        getFilePath(dir);
        getObj();
        getObjByClass();
        Test();
    }

    public static Map<Class<?> , Class<?>> classMap = new HashMap<>();  //用来把接口和实现接口的类对应起来
    public static Map<Class<?>,Map<Field,Class<?>>> TestMap = new HashMap<>();
    //类的字节码对应--类里面的成员变量,成员变量的字节码
    //public static Map<Field , Class<?>> fieldMap = new HashMap<>();  //用来把成员变量和包含这个成员变量的类对应起来
    public static Map<Class<?>,Object> objMap = new HashMap<>();     //用来把成员变量和其类型对应起来
    public static List<Class<?>> fieldList = new ArrayList<>();   //用来装所有带注解的接口的class的集合
    public static List<Object> objList = new ArrayList<>();   //用来装所有带注解的接口的class的集合
    public static List<Class<?>> classList = new ArrayList<>();   //只是用来看看打注解的类有没有被加进去


    public static void getFieldList(File dir)throws Exception{
        if(dir.isDirectory()){
            File[] files = dir.listFiles();
            for (File fileindir : files) {
                if (fileindir.isDirectory()) {
                    getFieldList(fileindir);
                } else {
                    String path = fileindir.getCanonicalPath().split("src\\\\")[1]
                            .replaceAll(".java", "").replaceAll("\\\\", ".");
                    Class<?> oneInAllClass = Class.forName(path);
                    if (oneInAllClass.getDeclaredFields() != null && oneInAllClass.getDeclaredFields().length > 0) {
                        HashMap<Field, Class<?>> fieldMap = new HashMap<>();
                        for (Field field : oneInAllClass.getDeclaredFields()) {
                            if (field.isAnnotationPresent(InterfaceField.class)) {
                                Class<?> type = field.getType();
                                fieldMap.put(field, type);
                                fieldList.add(type);
                            }
                        }
                        if(fieldMap.keySet().size()>0) {
                            TestMap.put(oneInAllClass, fieldMap);
                        }
                    }
                }
            }
        }
    }

    public static void getFilePath(File dir) throws Exception {
        if(dir.isDirectory()){
            File[] files = dir.listFiles();
            for (File fileindir : files) {
                if (fileindir.isDirectory()) {
                    getFilePath(fileindir);
                } else {
                    String path = fileindir.getCanonicalPath().split("src\\\\")[1]
                            .replaceAll(".java", "").replaceAll("\\\\",".");
                    Class<?> oneInAllClass = Class.forName(path);
                    if(oneInAllClass.isAnnotationPresent(InterfaceClass.class)){
                        Class<?>[] interfaces = oneInAllClass.getInterfaces();
                        classList.add(oneInAllClass);
                        if (interfaces != null && interfaces.length > 0) {
                            for (Class<?> aClass : interfaces) {
                                boolean flag = fieldList.contains(aClass);
                                if(flag){
                                    classMap.put(aClass,oneInAllClass);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void getObj(){
        for(Class<?> aClass : TestMap.keySet()) {
            Map<Field, Class<?>> fieldMap = TestMap.get(aClass);
            for (Field field : fieldMap.keySet()) {
                try {
                    Object o = aClass.newInstance();
                    Object obj = field.get(o);
                    obj = classMap.get(field.getType()).newInstance();
                    objMap.put(fieldMap.get(field), obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void getObjByClass()throws  Exception{
        for (Class<?> aClass2 : TestMap.keySet()) {
            Object Dome = aClass2.newInstance();
            Field[] declaredFields = Dome.class.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                Object o = objMap.get(declaredField.getType());
                String name = declaredField.getName();
                name = name.replaceFirst(String.valueOf(name.charAt(0)),String.valueOf(name.charAt(0)).toUpperCase());
                Method method = Dome.getClass().getMethod("set"+name, declaredField.getType());
                method.invoke(Dome,o);
            }
            ((Dome) Dome).Test();
            objList.add(Dome);
        }
    }



    public static  <T>  T changeObjByT(Object obj,Class<T> clazz)throws Exception{
        return (T) obj;
    }

    public static void Test()throws Exception{

    }
}
