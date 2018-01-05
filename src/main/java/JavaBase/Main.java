package JavaBase;

/**
 * Created by AFei on 2017/12/20.
 */
public class Main {
    public static void main(String[] args){
        for(int i =0 ; i<10000 ; i++) {
            internalClassTest();
        }
    }

    public static void internalClassTest(){
        InternalClass.InternalSonClass internalSonClass = new InternalClass.InternalSonClass();
        internalSonClass.getField();
    }

}
