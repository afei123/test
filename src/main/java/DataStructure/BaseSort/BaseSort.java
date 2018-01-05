package DataStructure.BaseSort;
import QueuePackage.Queue;


public class BaseSort {
    public static void main(String[] args){
        //System.out.println(3^1);11 ^ 01 = 10;
        Queue<Integer>[] queues = new Queue[10];
        for (int i = 0 ; i < 10 ; i++){
            queues[i] = new Queue<>();
        }
        int[] ints = {44, 56, 23, 543, 3246, 5432, 777, 5453, 123, 1, 5, 6453, 234};
        int bigNum = 0;
        for (int anInt : ints) {
            if (anInt>bigNum){
                bigNum = anInt;
            }
        }
        for(int i = 0 ; i <= getNumLength(bigNum) ; i++){
            for (int anInt : ints) {
                int aBit = anInt % ((int) Math.pow(10, i+1)) / ((int) Math.pow(10, i));
                queues[aBit].setTail(anInt);
            }
            int count = 0;
            for (Queue<Integer> queue : queues) {
                while (queue.size() > 0){
                    ints[count++] = queue.getHead();
                }
            }
        }
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    /**
     *时间复杂度 logn
     * @param i
     * @return
     */
    public static int getNumLength(int i){
        int count = 0;
        while (i != 0){
            i/=10;
            count++;
        }
        return count;
    }
}
