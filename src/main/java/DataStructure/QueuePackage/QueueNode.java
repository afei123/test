package DataStructure.QueuePackage;

public class QueueNode {
    private int level = 0;

    private Object obj;

    private QueueNode queueNode;

    public QueueNode(Object obj){
        this.obj = obj;
    }

    public void setHead(QueueNode queueNode){
        queueNode.setQueueNode(this);
        level++;
        if(this.queueNode != null) {
            this.queueNode.setHead(this);
        }
    }

    public QueueNode getQueueNodeByLevel(int level){
        if (this.getLevel() == level){
            return this;
        }
        return queueNode.getQueueNodeByLevel(level);
    }

    private int getLevel() {
        return level;
    }

    public Object getObj() {
        return obj;
    }

    public QueueNode getQueueNode() {
        return queueNode;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void setQueueNode(QueueNode queueNode) {
        this.queueNode = queueNode;
    }
    public void setLevel(int level){
        this.level = level;
    }
}
