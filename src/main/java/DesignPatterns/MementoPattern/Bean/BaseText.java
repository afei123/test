package DesignPatterns.MementoPattern.Bean;

import DesignPatterns.MementoPattern.Memento;

import java.io.Serializable;

/**
 * Created by AFei on 2017/12/5.
 */
public abstract class BaseText implements Serializable{
    protected String backgroundColor;
    protected long sleepTime;
    protected String masterName;
    protected String fileName;

    public BaseText(String fileName){
        this.fileName = fileName;
        Memento.addOriginator(DesignPatterns.ClonePattern.Main.bySeraializable(this));
    }

    public String getfileName() {
        return fileName;
    }

    public void setfileName(String fileName) {
        this.fileName = fileName;
        Memento.addOriginator(DesignPatterns.ClonePattern.Main.bySeraializable(this));
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        Memento.addOriginator(DesignPatterns.ClonePattern.Main.bySeraializable(this));
    }

    public long getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
        Memento.addOriginator(DesignPatterns.ClonePattern.Main.bySeraializable(this));
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
        Memento.addOriginator(DesignPatterns.ClonePattern.Main.bySeraializable(this));
    }

}
