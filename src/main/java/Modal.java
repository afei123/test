import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AFei on 2017/7/21.
 */
public class Modal {
    public static void main(String args[]) {
        String pattern = "(?=.*\\d)(?=.*[a-zA-Z]).{8,16}";
        String[] strs = "dsuhfhusdfhu123123123,h22h,bbbbbbbbbb,2222222222,@@@@@@@@@,22222bbbbb,2@@@*@@@@2,B@@@@@@@B,@22@@@@BBB".split(",");
            Pattern r = Pattern.compile(pattern);
        for(int i = 0 ;i < strs.length ;i++){
            Matcher m = r.matcher(strs[i]);
            boolean matches = m.matches();
            if(matches) {
                System.out.println(strs[i]);
            }
        }

    }
}
