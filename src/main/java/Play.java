import java.util.ArrayList;
import java.util.regex.Pattern;


/**
 * Created by AFei on 2017/9/15.
 */
public class Play {
    public static void main(String[] args){
       /* methodOne();
        methodTwo(10,1);*/
        //forNine();
        Pattern p = Pattern.compile("");
        p.matcher("");

        four(3,4);
    }
    public static void methodOne(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i = 0 ; i < 10 ; i++){
            list.add((list.get(i)+1)*2);
            System.out.println(list.get(i));
        }
    }
    public static void methodTwo(int day,int todayNum) {
        int yesterdayNum = 0;
        if (day>0) {
            yesterdayNum = (todayNum+1) * 2;
            System.out.println(day+"&"+todayNum);
            methodTwo(--day, yesterdayNum);
        }
    }
    public  static void forNine(){
        for (int i = 9;i > 0 ;i--){
            for(int j = i ; j < 10 ;j++ ){
                System.out.print(i+"*"+j);
            }
            System.out.println();
        }
    }
    public static void four(int i , int j){
        int min = 0;
        int max = 0;
        int MaximumCommonDivisor = 1;
        if(i > j){
            min = j;
            max = i;
        }else{
            min = i;
            max = j;
        }
        for(int k = min  ; k > 1 ; k-- ){
            if(min%k==0){
                if(max%k==0) {
                    MaximumCommonDivisor *= k;
                    min /= k;
                    max /= k;
                    k = min + 1;
                }
            }
        }
        System.out.println(MaximumCommonDivisor+"&"+max*min*MaximumCommonDivisor);
    }
}
