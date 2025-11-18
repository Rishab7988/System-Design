
/*
Only when the doSomething method is invoked the Service object is created and its method is invoked,
 */

import java.util.Objects;

public class ProxyService implements ServiceInterface {

    Service service;

    @Override
    public void doSomething()
    {
        System.out.println("validating user.....");
        if(Objects.isNull(this.service)) service = new Service();
        service.doSomething();
    }
}
