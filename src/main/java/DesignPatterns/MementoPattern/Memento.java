package DesignPatterns.MementoPattern;

import DesignPatterns.MementoPattern.Bean.BaseText;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFei on 2017/12/5.
 */
public class Memento {
    private static int statusNum = 0;

    private static List<BaseText> baseTexts = new ArrayList<>();

    public static void addOriginator(BaseText baseText){
        removeList(statusNum,baseTexts);
        baseTexts.add(baseText);
        if(baseTexts.size() > 10){
            baseTexts.remove(0);
        }else {
            statusNum++;
        }
    }
    public static void backOnce(){
        statusNum--;
        base(statusNum-1);
    }
    public static void headway(){
        if(baseTexts.size() > statusNum) {
            statusNum++;
        }else {
            System.out.println("这已经是最后一步了");
        }
        base(statusNum);
    }

    private static void base(int Num){
        BaseText arrText = baseTexts.get(Num);
        for (int i = 0 ; i < Win.baseTexts.size() ; i++) {
            if(arrText.getfileName().equals(Win.baseTexts.get(i).getfileName())){
                Win.baseTexts.set(i,arrText);
                removeList(i, Win.baseTexts);
            };
        }
    }
    private static void removeList(int endNum, List list){
        while (endNum < list.size() - 1){
            Win.baseTexts.remove(Win.baseTexts.size() - 1);
        }
    }
}
