package DesignPatterns.MementoPattern;

import DesignPatterns.MementoPattern.Bean.BaseText;
import DesignPatterns.MementoPattern.Bean.Excel;
import DesignPatterns.MementoPattern.Bean.Txt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AFei on 2017/12/5.
 */
public class Win {
    protected static List<BaseText> baseTexts = new ArrayList<>();


    public static BaseText createTxt(String fileName){
        Txt txt = new Txt(fileName);
        baseTexts.add(txt);
        return txt;
    }
    public static BaseText createExcel(String fileName){
        Excel excel = new Excel(fileName);
        baseTexts.add(excel);
        return excel;
    }
}
