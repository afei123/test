package DesignPatterns.IteratorPattern;

/**
 * Created by AFei on 2017/10/17.
 */
public class Main {
    public static void main(String[] args){
        TestList<String> stringTestList = new TestList<>();
        for (int i = 0 ; i<100 ;i++){
            stringTestList.add(String.valueOf(i));
        }
        String[] strings = new String[11];
        String dsa = stringTestList.get(1);
        System.out.println(stringTestList.size());
        /*for(int i = 0 ; i<100 ;i++){
            System.out.println(stringTestList.get(i));
        }*/
        while (stringTestList.hasNext()){
            System.out.println(stringTestList.next());
        }
    }

}
