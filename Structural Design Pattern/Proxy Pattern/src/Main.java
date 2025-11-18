import java.util.*;

/*
The proxy pattern provides a proxy for another object. I want to interact with a object, but instead of directly interacting with the object, I interact with a proxy object that then interacts with the actual object.
Ex: client -> proxy -> service. The proxy layer does additional computation.

Also used for lazy initialization scenarios. Create objects/make calls only when interface methods are invoked
*/

void main() {
//    Service service = new Service(); Not instantiating here. It is instantiated by the proxy as it is an expensive process. LAZY INITIALIZATION
    ServiceInterface proxyService = new ProxyService();
    Client client = new Client(proxyService);


    client.action();
}