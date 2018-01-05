package BTree;

/**
 * Created by AFei on 2017/9/28.
 */
public class Test {
    public static void main(String[] args){
        BTree.BTree one = new BTree.BTree(1, "nihao");
        createBTree(one);
    }
    public static void createBTree(BTree.BTree tArr){
        BTree.BTree B = new BTree.BTree(2, "B");
        BTree.BTree C = new BTree.BTree(3, "C");
        BTree.BTree D = new BTree.BTree(4, "D");
        BTree.BTree E = new BTree.BTree(5, "E");
        BTree.BTree F = new BTree.BTree(6, "F");
        BTree.BTree G = new BTree.BTree(7, "G");
        tArr.setTArr(new BTree.BTree[]{B,C,D});
        D.setTArr(new BTree.BTree[]{E,F});
        F.setTArr(new BTree.BTree[]{G});
    }
}
