import java.util.ArrayList;

/**
 * Created by AFei on 2017/8/21.
 */
public class TestMove {
    public static void main(String[] args){
        System.out.println(Math.pow(2,1.0/3));
        System.out.println(3>>1);//0011 变为 0001
        System.out.println(4>>1);//0100 变为0010
        System.out.println(3|5); //0011 0101 0001 计算的时候都为真的才是真
        System.out.println(1<<2);///0010 变为 0100
        ArrayList<String> strings = new ArrayList<>();
        strings.add("nihao ");
        strings.add("wohao ");

        ArrayList<Long> longs = new ArrayList<>();
        longs.add(2L);
        long i = 2L;
        System.out.println(longs.contains(i));
        System.out.println(longs.get(0)==i);
    }
}
