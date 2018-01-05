package Proxy;

/**
 * Created by AFei on 2017/9/19.
 */
@InterfaceClass
public class interfaceServiceImpl implements interfaceService {
    public String str = "success";

    @Override
    public  void play() {
        System.out.println("play");
    }


    public  void study() {
        System.out.println("study");
    }
}
