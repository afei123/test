package JavaCore;

/**
 * Created by AFei on 2017/12/19.
 */
public class StringApi {
    public static void main(String[] args){
        String asdf = UpperCase("asdf");
        System.out.println(asdf);
    }
    public static String UpperCase(String fieldName){
        char[] chars = fieldName.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
