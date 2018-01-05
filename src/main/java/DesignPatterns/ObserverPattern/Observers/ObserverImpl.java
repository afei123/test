package DesignPatterns.ObserverPattern.Observers;

import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * 这就体现出了多态和解耦
 * 每一个继承了Observable的类都可以通过调用update方法来监视
 * Created by AFei on 2017/12/11.
 */
public class ObserverImpl implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        try {
            Method method = o.getClass().getMethod("get" + arg);
            Object invoke = method.invoke(o);
            System.out.println(arg+"变为 : "+invoke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
