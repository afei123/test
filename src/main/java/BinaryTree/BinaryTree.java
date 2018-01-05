package BinaryTree;



/**
 * Created by AFei on 2017/9/27.
 */
public class BinaryTree {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1, "1节点");
        createTree(root);
        beforeInOrder(root);
        System.out.println("---------------");
        afterInOrder(root);
        System.out.println("---------------");
        inOrder(root);
    }
    public static void createTree(TreeNode root){
        TreeNode newNodeB = new TreeNode(2,"B");
        TreeNode newNodeC = new TreeNode(3,"C");
        TreeNode newNodeD = new TreeNode(4,"D");
        TreeNode newNodeE = new TreeNode(5,"E");
        TreeNode newNodeF = new TreeNode(6,"F");
        root.setLeftChild(newNodeB);
        root.setRightChild(newNodeC);
        newNodeB.setLeftChild(newNodeD);
        newNodeC.setLeftChild(newNodeE);
        newNodeC.setRightChild(newNodeF);
    }
    public static void beforeInOrder(TreeNode root){
        if(root != null) {
            System.out.println(root.getKey()+".."+root.getData()+"&&");
            beforeInOrder(root.getLeftChild());
            beforeInOrder(root.getRightChild());
        }
    }
    public static void afterInOrder(TreeNode root){
        if(root != null){
            afterInOrder(root.getLeftChild());
            afterInOrder(root.getRightChild());
            System.out.println(root.getKey()+".."+root.getData()+"&&");
        }
    }
    public static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.getLeftChild());
            System.out.println(root.getKey()+".."+root.getData()+"&&");
            inOrder(root.getRightChild());
        }
    }
}
