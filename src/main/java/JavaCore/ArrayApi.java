package JavaCore;

import java.util.Arrays;

/**
 * Created by AFei on 2017/11/16.
 */
public class ArrayApi {
    public static void main(String[] args){
        int[] a = {2,3,0,4,5};
        int[] ints = Arrays.copyOf(a, 3);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        ints[1] = 0;
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(a));
    }
}
