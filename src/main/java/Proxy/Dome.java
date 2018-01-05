package Proxy;

import lombok.Data;

/**
 * Created by AFei on 2017/9/19.
 */
@Data
public class Dome {
    @InterfaceField(name = "Test")
    public  interfaceService interfaceService;
    @InterfaceField(name = "Test")
    public  interfaceService2 interfaceService2;

    public Proxy.interfaceService getInterfaceService() {
        return interfaceService;
    }

    public void setInterfaceService(Proxy.interfaceService interfaceService) {
        this.interfaceService = interfaceService;
    }

    public Proxy.interfaceService2 getInterfaceService2() {
        return interfaceService2;
    }

    public void setInterfaceService2(Proxy.interfaceService2 interfaceService2) {
        this.interfaceService2 = interfaceService2;
    }

    public  void Test(){
        //System.out.println('-'<'0');
        interfaceService.play();
    }
}
