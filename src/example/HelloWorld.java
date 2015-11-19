package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by emhah on 11/16/2015.
 */
@WebService()
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://0.0.0.0:9000/HelloWorld";
    Endpoint.publish(address, implementor);
  }
}
