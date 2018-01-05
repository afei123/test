package DesignPatterns.ObserverPattern.Observers;

import java.util.Observable;

/**
 * 被观察者
 * Created by AFei on 2017/12/11.
 * 父类的private属性不能被子类直接使用
 * protected修饰的方法只能被子类使用
 */
public class Subject extends Observable{

    private String name;
    private int age;

    public Subject(){
        this.setChanged();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.notifyObservers("Name");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.notifyObservers("Age");
    }
}
