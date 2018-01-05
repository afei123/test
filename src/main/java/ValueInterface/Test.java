package ValueInterface;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by AFei on 2017/9/18.
 */
public class Test {
    public static void main(String[] args){
        //Test1();
        Test2();
    }
    public static void Test1(){
        Method[] methods = Dome.class.getMethods();
        for(Method method:methods){
            //如果method是在注解当下(interfaceMethod注解类)
            if(method.isAnnotationPresent(InterfaceMethod.class)){
                //获取method上的注解对象
                InterfaceMethod inter = method.getAnnotation(InterfaceMethod.class);
                //输出注解对象的age方法的值
                System.out.println(inter.age());
                try {
                    method.invoke(null,3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void Test2(){
        try {
            Field[] fields = Dome.class.getFields();
            for (Field field : fields) {
                if(field.isAnnotationPresent(InterfaceField.class)){
                    InterfaceField annotation = field.getAnnotation(InterfaceField.class);
                    System.out.println(annotation.asd());
                    Object obj = field.get(Dome.class.newInstance());
                    System.out.println(obj);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
