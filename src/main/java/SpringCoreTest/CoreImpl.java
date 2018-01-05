package SpringCoreTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.asm.Type;

/**
 * Created by AFei on 2017/12/1.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoreImpl implements Core {
    private String str;
    private String value;

    public CoreImpl(String str){
        this.str = str;
    }

    @Override
    public Object newInstance(String var1, String[] var2, Type[] var4, boolean var5, boolean var6, Long var7) {
        return null;
    }
}
