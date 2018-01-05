package DesignPatterns.ObserverPattern;

import DesignPatterns.ObserverPattern.Observers.ObserverImpl;
import DesignPatterns.ObserverPattern.Observers.Subject;

/**
 * Created by AFei on 2017/12/11.
 */
public class Main {
    public static void main(String[] args){
        Subject subject = new Subject();
        subject.addObserver(new ObserverImpl());
        subject.setName("NIHAO");
    }

}
