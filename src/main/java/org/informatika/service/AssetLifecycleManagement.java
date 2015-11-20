package org.informatika.service;
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
  private Connection dbConnection;

  public AssetLifecycleManagement () {
    dbConnection = DBConnectionManager.getConnection();

    if (dbConnection != null){
      System.out.println("DB connection success!");
    }
  }

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

}
