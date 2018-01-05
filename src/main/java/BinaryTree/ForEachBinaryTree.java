package BinaryTree;

/**
 * Created by AFei on 2017/7/31.
 */
public class ForEachBinaryTree {
    private static int x = 7;
    public static void main(String[] args){
        int[] b = new int[100];
        int[][] arrs;

        arrs = new int[x][];
        for(int i = 0 ;i<x;i++){
            arrs[i] = new int[(int)Math.pow(2,i)];
        }
        for (int i=0;i<x;i++){
            arrs[i][0] = (int)Math.pow(2,i);
           for(int j = 1; j<arrs[i].length ; j++){
               arrs[i][j] = arrs[i][j-1]+1;
           }
        }
        getCount(16,0);
        ceng(arrs);
        System.out.println("层序遍历");
        beforeTheOrder(arrs,0,0);
        System.out.println("前序遍历");
        afterTheOrder(arrs,arrs.length-1,0,0);
        System.out.println("后序遍历");
        inTheOrder(arrs,arrs.length-1,0,0,1);
        System.out.println("中序遍历");
    }


    public static void ceng(int[][] arrs){
        for (int i=0;i<arrs.length;i++){
            for(int j = 0; j<arrs[i].length ; j++){
                System.out.print(arrs[i][j]+"..");
            }
        }
    }

    public static void beforeTheOrder(int[][] arrs , int x ,int y){
        if(x < arrs.length){
            if(y < arrs[x].length) {
                System.out.print(arrs[x][y]+"..");
            }else if(y > arrs[arrs.length-1].length){
                return;
            }
            beforeTheOrder(arrs, x+1, 2*y);
            beforeTheOrder(arrs,x+1,2*y+1);
        }
    }
    private static void afterTheOrder(int[][] arrs, int x, int y, int z) {
        if(!(x < 0)){
            if(y < arrs[x].length){
                System.out.print(arrs[x][y]+"..");
                if(y % 2 != 0) {
                    afterTheOrder(arrs, x - 1, (y-1) / 2,z);
                }else{
                    z++;
                    afterTheOrder(arrs , arrs.length-1 , z , z);
                }
            }
        }
    }
    public static void inTheOrder(int[][] arrs,int x , int y, int z,int count){
        if(!(x<0)){
            if(y<arrs[x].length){
                count++;
                System.out.print(arrs[x][y] + "..");
                int i = getCount(count, 0);
                if(i>0) {
                    inTheOrder(arrs, arrs.length - i-1, y / (int) Math.pow(2,i), z,count);
                }else {
                    z++;
                    inTheOrder(arrs, arrs.length - 1, z, z, count);
                }
            }
        }
    }

    public static int getCount(int i,int count){
        if(i%2==0){
            count = getCount(i/2,count);
            count++;
        }
        return count;
    }
}


