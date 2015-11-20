package org.informatika.service;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.sql.*;

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
  public String getAsset(String IDAsset){
    String result = "";
    Integer i = 1;
    try {
      Connection connection;
      PreparedStatement preparedStatement;
      ResultSet resultSet;
      connection = DBConnectionManager.getConnection();
      preparedStatement = connection.prepareStatement("SELECT * FROM asset WHERE ID = ?");
      preparedStatement.setInt(i, Integer.parseInt(IDAsset));
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()){
        result += "ID Asset : " + resultSet.getString("ID") + "\n";
        result += "Pemilik Asset : " + resultSet.getString("Pemilik")+ "\n";
        result += "Kategori : " + resultSet.getString("Kategori")+ "\n";
        result += "jenis : " + resultSet.getString("Jenis")+ "\n";
        result += "Kondisi : " + resultSet.getString("Kondisi")+ "\n";
        result += "Nama Vendor : " + getAssetVendor(IDAsset)+ "\n";
        result += "Tanggal Masuk : " + resultSet.getString("Tanggal_Masuk")+ "\n" + "\n";
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return result;
  }

  @WebMethod
  public String getAssetVendor(String assetID){
    Integer i = 1;
    String result = null;
    try {
      Connection connection;
      PreparedStatement preparedStatement;
      ResultSet resultSet;
      connection = DBConnectionManager.getConnection();
      preparedStatement = connection.prepareStatement("SELECT * FROM vendor,asset WHERE asset.ID = ? GROUP BY asset.ID");
      preparedStatement.setString(i,assetID);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()){
        result = resultSet.getString("Nama");
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;
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
    connection = DBConnectionManager.getConnection();
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