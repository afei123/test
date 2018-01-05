package IoAndSerializableTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by AFei on 2017/11/21.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class testObject implements Serializable {
    private String name;

    //transient 标识的变量不会被序列化
    private transient int age;

    private static int weight = 22;

    public int getWeight(){
        return weight;
    }
}
