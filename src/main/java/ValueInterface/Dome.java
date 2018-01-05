package ValueInterface;

/**
 * Created by AFei on 2017/9/18.
 */
public class Dome {
    @InterfaceField(asd = "Test")
    public String asd;

    @InterfaceField(asd = "nihaoa")
    public String dsa = "ceshi";

    @InterfaceMethod(age = 5)
    public static void Test(int age){
        System.out.println(age);
    }

    public static void main(String[] args){
        Test(4);
    }


}
