import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by AFei on 2017/5/26.
 */

@ToString
@AllArgsConstructor
@Data
public class Domain {

    public Domain(){
        System.out.println("执行了构造方法");
    }

    private String asd;

    private List<Object> list;
    public String getAsd() {
        return asd;
    }

    public List<Object> getList() {
        return list;
    }

    public void setAsd(String asd) {
        this.asd = asd;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

}
