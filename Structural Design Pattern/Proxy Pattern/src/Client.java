public class Client {

    ServiceInterface serviceInterface;

    Client(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    void action() {
        serviceInterface.doSomething();
    }
}
