import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by AFei on 2017/10/11.
 */
public class Test {
    public static void main(String[] args){
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            Properties props=System.getProperties();
            //操作系统名称
            String osName = props.getProperty("os.name");
            //操作系统构架
            String osArch = props.getProperty("os.arch");
            //操作系统版本
            String osVersion = props.getProperty("os.version");
            System.out.println(localHost.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<10 ; i++){
            if(i == 5){
                continue;
            }else{
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
