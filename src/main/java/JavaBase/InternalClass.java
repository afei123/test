package JavaBase;

/**
 * Created by AFei on 2017/12/20.
 */
public class InternalClass {
    private static final int i = 10;

    public static class InternalSonClass{
        public void getField(){
            System.out.println(InternalClass.i);
        }
    }
}
