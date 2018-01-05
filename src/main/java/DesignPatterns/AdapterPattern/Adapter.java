package DesignPatterns.AdapterPattern;

import DesignPatterns.AdapterPattern.Core.Core;

/**
 * Created by AFei on 2017/10/10.
 */
public class Adapter {

    private Core core;

    public void setCore(Core core){
        this.core = core;
    }

    public void shell(){
        System.out.println("适配器的外壳1");
        core.getCore();
        System.out.println("适配器的外壳2");

    }
}
