package BTree;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by AFei on 2017/9/28.
 */
@Data
@NoArgsConstructor
@ToString
public class BTree {
    private int key;
    private String data;
    private BTree.BTree[] tArr;
    public BTree(int key,String data){
        this.key = key;
        this.data = data;
        tArr = null;
    }
}
