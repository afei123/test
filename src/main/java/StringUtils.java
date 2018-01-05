import java.util.Arrays;
import java.util.List;

/**
 * Created by AFei on 2017/11/10.
 */
public class StringUtils {
    public static void main(String[] args){
        Integer[] RATE_COL= new Integer[]{6,9,10,13,14};
        List<Integer> integers = Arrays.asList(RATE_COL);
        System.out.println(String.format("G%d/F%d",6,5));
    }
}
