package DesignPatterns.MementoPattern;

import DesignPatterns.MementoPattern.Bean.BaseText;

import java.util.List;

/**
 * Created by AFei on 2017/12/5.
 */
public class Main {
    public static void main(String[] args){
        BaseText winTxt = Win.createTxt("文本文件");
        winTxt.setSleepTime(1000L);
        winTxt.setBackgroundColor("red");
        winTxt.setMasterName("afei");
        BaseText winExcel = Win.createExcel("Excel文本");
        winExcel.setSleepTime(222L);
        List<BaseText> baseTexts = Win.baseTexts;
        Memento.backOnce();
        Memento.backOnce();
        System.out.println(1);
    }
}
