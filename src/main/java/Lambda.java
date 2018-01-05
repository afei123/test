import BinaryTree.TreeNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by AFei on 2017/9/28.
 */
public class Lambda {
    public static void main(String[] args){
        listLambda();
    }
    public static void mapLambda(){
        HashMap<String, String> hash = new HashMap<>();
        hash.forEach((v,k)->{
            System.out.println(v+".."+k);
        });
        ArrayList<String> strings = new ArrayList<>(hash.values());
        ArrayList<String> strings1 = new ArrayList<>(hash.keySet());
        hash.keySet().forEach(k->System.out.println(k));
        Collection<String> values = hash.values();
        List<String> collect = values.stream().collect(Collectors.toList());
        List<String> collect1 = hash.keySet().stream().collect(Collectors.toList());
    }
    public static void listLambda(){
        ArrayList<TreeNode> TestList = new ArrayList<>();
        TestList.add(new TreeNode(0,"nihao"));
        List<Integer> filterAndMap = TestList.stream().filter(s -> s.getKey() == 1).map(s -> s.getKey()).collect(Collectors.toList());

        TestList.stream().forEach(t->{
            t.setKey(t.getKey()+12);
        });

        List<Integer> keyList = TestList.stream().map(m -> {
            m.setKey(m.getKey() + 12);
            return m.getKey();
        }).collect(Collectors.toList());

        List<Integer> collect = TestList.stream().map(t -> t.getKey()).collect(Collectors.toList());
        List<Integer> collect1 = collect.stream().filter(m -> m == 1).collect(Collectors.toList());

        collect1.stream().findFirst();
        collect1.stream().limit(10);

        TestList.sort(Comparator.comparing(TreeNode::getKey).reversed());

        Map<Integer, String> listToMap = TestList.stream().collect(Collectors.toMap(TreeNode::getKey, TreeNode::getData));
    }

    public static void setLambda(){
        HashSet<TreeNode> set = new HashSet<TreeNode>(new ArrayList<TreeNode>());
        ArrayList<TreeNode> stringList = new ArrayList<>(set);
        HashSet<String> valueSet = new HashSet<>(new HashMap<String, String>().values());
        Map<Integer, String> TreeNodeMap = set.stream().collect(Collectors.toMap(TreeNode::getKey, TreeNode::getData));

    }

}
