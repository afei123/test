package SpringCoreTest;

import org.springframework.cglib.core.KeyFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by AFei on 2017/11/21.
 */
public class KeyFactoryTest {
    public static void main(String[] args){
        getKeyFactory();
    }

    public static void getKeyFactory(){
        //探究是如何通过一个接口来获取对象的
        Core asd = (Core) KeyFactory.create(Core.class);
        Object test = asd.newInstance("test", new String[]{"nihao", "2323"},  null, true, true, 11L);

        Class<?> aClass = test.getClass();
        //System.out.println(test);
        Field[] fields = aClass.getFields();
        //System.out.println(fields.length);
        for (Field field : fields) {
            System.out.println(field);
        }
        Method[] methods = aClass.getMethods();
        System.out.println(asd);
    }

}
