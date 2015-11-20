package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by emhah on 11/16/2015.
 */
@WebService()
public class AssetLifecycleManagement {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  @WebMethod
  public String registerAsset(){
    return " ";
  }

  @WebMethod
  public String deleteAsset(){
    return " ";
  }

  @WebMethod
  public String updaterAsset(){
    return " ";
  }

  @WebMethod
  public String getAsset(){
    return " ";
  }

  @WebMethod
  public String getAssetVendor(String assetID){
    return " ";
  }

  @WebMethod
  public String notifyAssetMaintenance(String assetID){
    return " ";
  }


  public static void main(String[] argv) {
    Object implementor = new AssetLifecycleManagement();
    String address = "http://localhost:9000/AssetLifecycleManagement";
    Endpoint.publish(address, implementor);
    Connection connection;
    connection = DBConncetionManager.getConnection();
    if (connection != null){
      System.out.println("DB conncetion success!");
    }
    try {
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
