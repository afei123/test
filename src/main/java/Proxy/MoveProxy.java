package Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by AFei on 2017/9/21.
 */
public class MoveProxy {
    public static void main(String[] args)throws  Exception{
        //TestJdkProxy();
        cglibProxy();
    }

    public static void TestJdkProxy(){
        Class<Proxy.interfaceServiceImpl> aClass = Proxy.interfaceServiceImpl.class;
        Proxy.interfaceService proxyDome = (Proxy.interfaceService) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), new InvocationHandler() {
            private String str = "nihao";

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(11);
                if (method.getName().equals("play")) {
                    Object invoke = method.invoke(aClass.newInstance(), args);
                    System.out.println("动态代理success");
                    return invoke;
                }
                return null;
            }
        });
        proxyDome.study();
        proxyDome.play();
    }

    public static void cglibProxy(){
        Proxy.interfaceServiceImpl o1 = (Proxy.interfaceServiceImpl)Enhancer.create(Proxy.interfaceServiceImpl.class, new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("Before invoke " + method);
                Object result = methodProxy.invokeSuper(obj, objects);
                System.out.println("After invoke" + method);
                return result;
            }
        });
        o1.play();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Proxy.interfaceServiceImpl.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("Before invoke " + method);
                Object result = methodProxy.invokeSuper(obj, objects);
                System.out.println("After invoke" + method);
                return result;
            }
        });
        Proxy.interfaceServiceImpl o = (Proxy.interfaceServiceImpl) enhancer.create();
        o.play();
    }
}
