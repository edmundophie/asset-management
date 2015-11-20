package org.informatika.service;
import org.json.simple.*;
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
  public String getAssetbyKategori(String Kategori){
    JSONArray Array;
    Array = new JSONArray();
    try {
      ResultSet resultSet;
      resultSet = executeQuery("SELECT * FROM asset WHERE Kategori = "+Kategori);

      while (resultSet.next()){
        JSONObject object; object =createJSON(resultSet);
        Array.add(object);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return Array.toString();
  }

  @WebMethod
  public String getAsset(String IDAsset){
    String result = "";
    Integer i = 1;
    JSONArray Array;
    Array = new JSONArray();
    try {
      ResultSet resultSet;
      resultSet = executeQuery("SELECT * FROM asset WHERE ID = "+IDAsset);
      while (resultSet.next()){
        JSONObject object; object =createJSON(resultSet);
        Array.add(object);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return Array.toString();
  }


  private String getAssetVendor(String assetID){
    String result = null;
    try {
      ResultSet resultSet;
      resultSet = executeQuery("SELECT * FROM vendor,asset WHERE asset.ID = "+assetID+" GROUP BY asset.ID");
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

  private ResultSet executeQuery(String Query) throws SQLException {
      Connection connection;
      PreparedStatement preparedStatement;
      ResultSet resultSet;
      connection = DBConnectionManager.getConnection();
      preparedStatement = connection.prepareStatement(Query);
      resultSet = preparedStatement.executeQuery();

      return resultSet;
  }

  private JSONObject createJSON(ResultSet resultSet) throws SQLException {
    JSONObject object; object = new JSONObject();
    object.put("ID Asset", resultSet.getString("ID"));
    object.put("Institusi", resultSet.getString("Institusi"));
    object.put("Karegori", resultSet.getString("Kategori"));
    object.put("Jenis", resultSet.getString("Jenis"));
    object.put("Kondisi", resultSet.getString("Kondisi"));
    object.put("Nilai Jual", resultSet.getString("Tanggal_Masuk"));
    object.put("Nama Vendor", getAssetVendor(resultSet.getString("ID")));
    object.put("Tanggal Masuk", resultSet.getString("Tanggal_Masuk"));
    return object;
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