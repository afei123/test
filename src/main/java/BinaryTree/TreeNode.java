package BinaryTree;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by AFei on 2017/9/28.
 */
@ToString
@NoArgsConstructor
@Data
public class TreeNode {
    private int key;
    private String data;
    private BinaryTree.TreeNode leftChild;
    private BinaryTree.TreeNode rightChild;
    public TreeNode(int key ,String data){
        this.key = key;
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
