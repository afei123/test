package DesignPatterns.ClonePattern;

import org.springframework.cglib.beans.BeanCopier;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by AFei on 2017/10/11.
 */
public class Main {
    public static void main(String[] args){
        //clone对象
        Common common = new Common();
        common.setCommon("asd");

        CloneTest cloneTest = new CloneTest();
        cloneTest.setCommon(common);
        //clone集合
        ArrayList<Common> commonList = new ArrayList<>();
        commonList.add(new Common("test"));
        commonList.add(new Common("nihao a "));
        cloneTest.setCommonList(commonList);
        //clone基本类型
        cloneTest.setI(44);
        cloneTest.setString("d");

        //byClone(cloneTest);
        //byCglib(cloneTest);
        CloneTest bySeraializable = bySeraializable(cloneTest);
        CloneTest cloneTest1 = byClass(cloneTest);
        CglibClone cglibClone = BeanCopier(cloneTest,CglibClone.class);
        //验证是否是浅clone
        cloneTest.getCommon().setCommon("das");
        System.out.println(2);
    }

    /**
     * 通过反射实现对象成员变量的映射
     * @param cloneObj
     * @param <T>
     * @return
     */
    public static <T> T BeanCopier(Object cloneObj,Class<T> aClass){
        try {
            Class<?> clazz = cloneObj.getClass();
            Object obj = aClass.newInstance();
            for (Field field : clazz.getDeclaredFields()) {
                String fieldName = field.getName();
                String methodName = fieldName.replaceFirst(String.valueOf(fieldName.charAt(0)), String.valueOf(fieldName.charAt(0)).toUpperCase());
                Method getMethod = null;
                if(field.getType()==boolean.class){
                    getMethod = clazz.getMethod("is" + methodName);
                }else {
                    getMethod = clazz.getMethod("get" + methodName);
                }
                Object invoke = getMethod.invoke(cloneObj);
                try {
                    Method setMethod = aClass.getMethod("set" + methodName, field.getType());
                    setMethod.invoke(obj, invoke);
                }catch(Exception e){
                    System.out.println("没有"+fieldName+"这个属性");
                }
            }
            return (T)obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 通过反射实现clone对象我写的是浅clone
     * @param cloneTest
     * @param <T>
     * @return
     */
    public static <T> T byClass(T cloneTest){
        return (T)BeanCopier(cloneTest,cloneTest.getClass());
    }

    /**
     * 通过序列化实现深度clone对象
     * @param cloneTest
     * @param <T>
     * @return
     */
    public static <T> T bySeraializable(T cloneTest) {
        try {
            ByteArrayOutputStream byteArrayOutStream = new ByteArrayOutputStream();
            ObjectOutputStream objOutStream = new ObjectOutputStream(byteArrayOutStream);
            objOutStream.writeObject(cloneTest);
            objOutStream.flush();
            ByteArrayInputStream byteArrayInStream = new ByteArrayInputStream(byteArrayOutStream.toByteArray());
            ObjectInputStream objInStream = new ObjectInputStream(byteArrayInStream);
            T obj = (T) objInStream.readObject();
            //关闭流
            byteArrayOutStream.close();
            objOutStream.close();
            byteArrayInStream.close();
            objInStream.close();
            return obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 通过实现cloneable接口实现浅clone
     * @param cloneTest
     */
    public static void byClone(CloneTest cloneTest){

        CloneTest clone = (CloneTest)cloneTest.clone();

        //是浅clone , clone对象的指针还是指向原有对象的成员变量的对象
        System.out.println(cloneTest.getCommon().getCommon());
        System.out.println(clone.getCommon().getCommon());
    }

    /**
     * cglib克隆存在缺陷
     * @param cloneTest
     */
    public static void byCglib(CloneTest cloneTest){
        BeanCopier beanCopier = BeanCopier.create(CloneTest.class, CglibClone.class, false);
        CglibClone cglibClone = new CglibClone();
        beanCopier.copy(cloneTest,cglibClone,null);
        System.out.println(cglibClone.getCommon().getCommon());
        System.out.println(cglibClone.getI());
    }
}
