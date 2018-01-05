import SpringCoreTest.Core;
import SpringCoreTest.CoreImpl;

import java.util.*;

/**
 * Created by AFei on 2017/12/1.
 */
public class stuff {
    public static void main(String[] args){
        List<String> arraylist = getNumList();
        List<CoreImpl> coreList = findObject();
        HashMap<String, CoreImpl> stringCoreHashMap = new HashMap<>();
        List<Core> cores = new ArrayList<>();
        for (CoreImpl core : coreList) {
            stringCoreHashMap.put(core.getStr(),core);
        }
        //二个for循环的时候使用一个map就不会有嵌套循环出现了
        for (String key : arraylist) {
            CoreImpl core = stringCoreHashMap.get(key);
            if(Objects.isNull(core)){
                cores.add(new CoreImpl(key));
            }else{
                cores.add(stringCoreHashMap.get(key));
            }
        }
        System.out.println(cores.toString());
    }

    private static List<String> getNumList(){
        String[] strs = new String[10];
        for(int i = 0 ; i < 10 ; i++){
            strs[i] = "a"+i;
        }
        return Arrays.asList(strs);
    }
    private static List<CoreImpl> findObject() {
        CoreImpl[] arr = new CoreImpl[]{new CoreImpl("a3","a3nihao"),new CoreImpl("a5","a5nihao")};
        return Arrays.asList(arr);
    }
}
