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
  private Connection dbConnection;
  private final static String ASSET_TABLE = "asset";
  private final static String VENDOR_TABLE = "vendor";
  private final static String MAINTENANCE_TABLE = "maintenance";

  public static enum ResponseStatus {
    SUCCESS(200),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    private final int code;
    ResponseStatus(int code) { this.code = code; }

    public int getCode() {return this.code; }

    public String getResponseMessage() {
      String responseMessage = "";
      switch(this.code) {
        case 200:
          responseMessage = "Operasi berhasil dilakukan";
        case 404:
          responseMessage = "Objek tidak ditemukan pada database";
        case 500:
          responseMessage = "Terjadi kesalahan pada server";
      }
      return responseMessage;
    }
  }

  public static enum AssetCondition {
    BAIK("BAIK"),
    BURUK("BURUK"),
    BUTUH_PERBAIKAN("BUTUH PERBAIKAN");

    private final String condition;
    private AssetCondition(String condition) {this.condition = condition;}
    public String getCondition(){ return this.condition; }
  }

  public AssetLifecycleManagement() {
    dbConnection = DBConnectionManager.getConnection();
    if (dbConnection != null){
      System.out.println("DB conncetion success!");
    }
  }

  public void close() {
    try {
      dbConnection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @WebMethod
  public String registerAsset(String kategori, AssetCondition kondisi, String institusi, String jenis, int idvendor, String harga) throws SQLException {
    String query =  "INSERT INTO "+ASSET_TABLE+" (kategori, tanggal_masuk, kondisi, institusi, jenis, idvendor, harga) " +
                    "VALUES ('"+kategori+"', now(), '"+kondisi.getCondition()+"', '"+institusi+"', '"+jenis+"', "+idvendor+", '"+harga+"')";

    executeQuery(query);
    return JSONValue.toJSONString(createJsonResponse(ResponseStatus.SUCCESS));
  }

  @WebMethod
  public String insertMaintenanceSchedule(int idvendor, int idasset, int jadwalMaintenance, String catatan) throws SQLException {
    String query =  "INSERT INTO "+MAINTENANCE_TABLE+" (idvendor, idasset, jadwal, catatan) " +
            "VALUES ("+idvendor+", "+idasset+", "+jadwalMaintenance+", '"+catatan+"')";

    executeQuery(query);
    return JSONValue.toJSONString(createJsonResponse(ResponseStatus.SUCCESS));
  }

  @WebMethod
  public String registerVendor(int idvendor, String nama, String alamat, String kontak) throws SQLException {
    String query =  "INSERT INTO "+VENDOR_TABLE+" (nama, alamat, kontak) " +
            "VALUES ('"+nama+"', '"+alamat+"', '"+kontak+"')";
    executeQuery(query);
    return JSONValue.toJSONString(createJsonResponse(ResponseStatus.SUCCESS));
  }

  @WebMethod
  public String deleteAsset(String idAsset){
    String query = "DELETE FROM "+ASSET_TABLE+" WHERE id="+idAsset;
    try {
      executeQuery(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return JSONValue.toJSONString(createJsonResponse(ResponseStatus.SUCCESS));
  }

  @WebMethod
  public String setAssetOwner(int assetId, String assetOwner) throws SQLException {
    String query = "UPDATE "+ASSET_TABLE + " " +
                    "SET institusi='" +assetOwner+"' "+
                    "WHERE id="+assetId;
    executeQuery(query);
    return JSONValue.toJSONString(createJsonResponse(ResponseStatus.SUCCESS));
  }

  @WebMethod
  public String setAssetCondition(int assetId, AssetCondition condition) throws SQLException {
    String query = "UPDATE "+ASSET_TABLE + " " +
                    "SET kondisi='" +condition.getCondition()+"' "+
                    "WHERE id="+assetId;
    executeQuery(query);
    return JSONValue.toJSONString(createJsonResponse(ResponseStatus.SUCCESS));
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
      PreparedStatement preparedStatement;
      ResultSet resultSet;
      preparedStatement = dbConnection.prepareStatement(Query);
      resultSet = preparedStatement.executeQuery();

      return resultSet;
  }

  private JSONObject createJSON(ResultSet resultSet) throws SQLException {
    JSONObject object; object = new JSONObject();
    object.put("ID Asset", resultSet.getString("ID"));
    object.put("Institusi", resultSet.getString("Institusi"));
    object.put("Kategori", resultSet.getString("Kategori"));
    object.put("Jenis", resultSet.getString("Jenis"));
    object.put("Kondisi", resultSet.getString("Kondisi"));
    object.put("Nilai Jual", resultSet.getString("Tanggal_Masuk"));
    object.put("Nama Vendor", getAssetVendor(resultSet.getString("ID")));
    object.put("Tanggal Masuk", resultSet.getString("Tanggal_Masuk"));
    return object;
  }

  public static void main(String[] argv) {
    AssetLifecycleManagement implementor = new AssetLifecycleManagement();
    String address = "http://localhost:9000/AssetLifecycleManagement";
    Endpoint.publish(address, implementor);
    implementor.close();
  }

  private JSONObject createJsonResponse(ResponseStatus status, Object content) {
    JSONObject object = new JSONObject();
    object.put("Status Code", status.getCode());
    if (status != ResponseStatus.SUCCESS)
      object.put("Content", status.getResponseMessage());
    object.put("Content", content);

    return object;
  }

  private JSONObject createJsonResponse(ResponseStatus status) {
    return createJsonResponse(status, new Object());
  }
}