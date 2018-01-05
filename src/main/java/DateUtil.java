import java.util.Calendar;
import java.util.Date;

/**
 * Created by AFei on 2017/11/8.
 */
public class DateUtil {
    private static Calendar calendar;
    public static void main(String[] args){
        DateUtil.createCalendar();
        Date date = new Date();
        calendar.setTime(date);
        addOneDay();
        getDayNum();
    }

    private static void addOneDay(){
        calendar.add(Calendar.DATE,1);
        System.out.println(calendar.getTime());
    }
    private static void getDayNum(){
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(week);
        System.out.println(hour);
    }

    private static Calendar createCalendar(){
        if(calendar == null) {
            synchronized (DateUtil.class) {
                if (calendar == null) {
                    calendar = Calendar.getInstance();
                }
            }
        }
        return calendar;
    }
}
