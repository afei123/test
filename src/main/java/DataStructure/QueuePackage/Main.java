package DataStructure.QueuePackage;

public class Main {
    public static void main(String[] args){
        test();
    }

    private static void test() {
        Queue<String> queue = new Queue();
        for (int i = 0;i < 10 ; i++){
            queue.setHead(i+"");
        }
        queue.setTail("a tail");
        queue.insertQueueNode(3,"insert test");
        for (int i = 0;i < queue.size() ; i++){
            String value = queue.getValueByLevel(i);
            System.out.println(value);
        }
    }
}
