import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AFei on 2017/9/15.
 */
public class MatcherTest {
    public static void main(String[] args){
        /*find();
        long one = System.currentTimeMillis();
        for(int i = 0 ; i<1000 ;i++) {
            mySelf();
        }
        long two = System.currentTimeMillis();
        for(int i = 0 ; i<1000 ;i++) {
            betterMoreThanMySelf();
        }
        long three = System.currentTimeMillis();
        System.out.println(two-one+"duibi"+(three-two));*/
        ifContant("ppp","sdfspppfs");   //find()是看有没有能匹配上的   matcher()是看能不能完全匹配上

    }
    public static void find(){
        String str = "asdfjvjadsfafvaadfkfasaffdsasdffadsafafsafdadsfaafd";
        Pattern compile = Pattern.compile("af");
        Matcher matcher = compile.matcher(str);
        int num = 0;
        while(matcher.find()){
            num++;
        }
        System.out.println(num);
    }
    public static void mySelf(){
        String str = "abDEe23dJfd343dPOddfe4CdD5ccv!23rr";
        String str2 = str.replaceAll("[^A-Za-z]", "");
        System.out.println(str2);
        char[] chars = str2.toCharArray();
        Pattern compile = Pattern.compile("[A-Z]");
        StringBuffer stringBuffer = new StringBuffer();
        for(char ch:chars){
            String s = String.valueOf(ch);
            if(compile.matcher(s).matches()){
                stringBuffer.append(s.toLowerCase());
            }else{
                stringBuffer.append(s.toUpperCase());
            }
        }
        System.out.println(stringBuffer);
    }
    public static void betterMoreThanMySelf(){
        String str = "abDEe23dJfd343dPOddfe4CdD5ccv!23rr";
        String str2 = str.replaceAll("[^A-Za-z]", "");
        System.out.println(str2);
        String upStr = str2.toUpperCase();
        String lowerStr = str2.toLowerCase();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0 ; i < upStr.length() ;i++){
            if(upStr.charAt(i) == str2.charAt(i)){
                stringBuffer.append(lowerStr.charAt(i));
            }else{
                stringBuffer.append(upStr.charAt(i));
            }
        }
        System.out.println(stringBuffer);
    }
    public static void ifContant2(String strOne , String strTwo){
        Pattern compile = Pattern.compile(strOne);
        boolean flag = compile.matcher(strTwo).find();

        System.out.println(flag);
    }
    public static void ifContant(String strOne , String strTwo){
        System.out.println(strTwo.contains(strOne));
    }
}
