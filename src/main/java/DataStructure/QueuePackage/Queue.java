package DataStructure.QueuePackage;

public class Queue<T> {
    private QueueNode queueNode;
    private QueueNode tailQueueNode;
    private int queueSize;

    public Queue (){
    }
    public  void  setHead(T obj){
        QueueNode queueNode = new QueueNode(obj);
        if (this.queueNode == null){
            this.tailQueueNode = queueNode;
            queueSize = 1;
        }else {
            this.queueNode.setHead(queueNode);
            queueSize++;
        }
        this.queueNode = queueNode;
    }
    public T getHead(){
        T returnObj = (T)queueNode.getObj();
        queueNode = queueNode.getQueueNode();
        queueSize--;
       return returnObj;
    }
    public void setTail(T obj){
        QueueNode tailQueueNode = new QueueNode(obj);
        tailQueueNode.setLevel(queueSize);
        if (this.queueNode == null){
            this.queueNode = tailQueueNode;
            queueSize = 1;
        }else{
            this.tailQueueNode.setQueueNode(tailQueueNode);
            queueSize++;
        }
        this.tailQueueNode = tailQueueNode;
    }
    public void insertQueueNode(int level , T obj){
        QueueNode queueNode = new QueueNode(obj);
        queueNode.setLevel(level);
        QueueNode beforeQueueNode = this.queueNode.getQueueNodeByLevel(level - 1);
        QueueNode afterQueueNode = beforeQueueNode.getQueueNode();
        afterQueueNode.setHead(queueNode);
        beforeQueueNode.setQueueNode(queueNode);
    }
    public T getValueByLevel(int level){
        if(level > queueSize) {
            System.out.println("超过队列范围了");
        }
        return (T) queueNode.getQueueNodeByLevel(level).getObj();
    }
    public int size(){
        return queueSize;
    }

}
