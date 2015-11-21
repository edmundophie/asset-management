package org.informatika.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by emhah on 11/16/2015.
 */
@WebService()
public class AssetLifecycleManagement {
    // Harus dibikin static bro kalo cuman mau di
    private static Connection dbConnection;
    private final static String ASSET_TABLE = "asset";
    private final static String VENDOR_TABLE = "vendor";
    private final static String MAINTENANCE_TABLE = "maintenance";

    public static enum ResponseStatus {
        SUCCESS(200),
        NOT_FOUND(404),
        INTERNAL_SERVER_ERROR(500);

        private final int code;

        ResponseStatus(int code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }

        public String getResponseMessage() {
            String responseMessage = "";
            switch (this.code) {
                case 200:
                    responseMessage = "Operasi berhasil dilakukan";break;
                case 404:
                    responseMessage = "Objek tidak ditemukan pada database";break;
                case 500:
                    responseMessage = "Terjadi kesalahan pada server";break;
            }
            return responseMessage;
        }
    }

    public static enum AssetCondition {
        BAIK("BAIK"),
        RUSAK("RUSAK"),
        BUTUH_PERBAIKAN("BUTUH PERBAIKAN");

        private final String condition;

        private AssetCondition(String condition) {
            this.condition = condition;
        }

        public String getCondition() {
            return this.condition;
        }
    }

    public AssetLifecycleManagement() {
        dbConnection = DBConnectionManager.getConnection();
        if (dbConnection != null) {
            System.out.println("DB connection success!");
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
        String query = "INSERT INTO " + ASSET_TABLE + " (kategori, tanggal_masuk, kondisi, institusi, jenis, idvendor, harga) " +
                "VALUES ('" + kategori + "', now(), '" + kondisi.getCondition() + "', '" + institusi + "', '" + jenis + "', " + idvendor + ", '" + harga + "')";

        if(executeUpdateQuery(query)==0)
            return createJsonResponse(ResponseStatus.NOT_FOUND);
        else
            return createJsonResponse(ResponseStatus.SUCCESS);
    }

    @WebMethod
    public String insertMaintenanceSchedule(int idvendor, int idasset, int jadwalMaintenance, String catatan) throws SQLException {
        String query = "INSERT INTO " + MAINTENANCE_TABLE + " (idvendor, idasset, jadwal, catatan) " +
                "VALUES (" + idvendor + ", " + idasset + ", " + jadwalMaintenance + ", '" + catatan + "')";


        if(executeUpdateQuery(query)==0)
            return createJsonResponse(ResponseStatus.NOT_FOUND);
        else
            return createJsonResponse(ResponseStatus.SUCCESS);
    }

    @WebMethod
    public String registerVendor(String nama, String alamat, String kontak) throws SQLException {
        String query = "INSERT INTO " + VENDOR_TABLE + " (nama, alamat, kontak) " +
                "VALUES ('" + nama + "', '" + alamat + "', '" + kontak + "')";

        if(executeUpdateQuery(query)==0)
            return createJsonResponse(ResponseStatus.NOT_FOUND);
        else
            return createJsonResponse(ResponseStatus.SUCCESS);
    }

    @WebMethod
    public String deleteAsset(int idAsset) throws SQLException {
        String query = "DELETE FROM " + ASSET_TABLE + " WHERE id=" + idAsset;
        String query2 = "DELETE FROM " + MAINTENANCE_TABLE+ " WHERE idasset=" + idAsset;

        executeUpdateQuery(query2);
        if(executeUpdateQuery(query)==0)
            return createJsonResponse(ResponseStatus.NOT_FOUND);
        else
            return createJsonResponse(ResponseStatus.SUCCESS);
    }

    @WebMethod
    public String setAssetOwner(int assetId, String assetOwner) throws SQLException {
        String query = "UPDATE " + ASSET_TABLE + " " +
                "SET institusi='" + assetOwner + "' " +
                "WHERE id=" + assetId;

        if(executeUpdateQuery(query)==0)
            return createJsonResponse(ResponseStatus.NOT_FOUND);
        else
            return createJsonResponse(ResponseStatus.SUCCESS);
    }

    @WebMethod
    public String setAssetCondition(int assetId, AssetCondition condition) throws SQLException {
        String query = "UPDATE " + ASSET_TABLE + " " +
                "SET kondisi='" + condition.getCondition() + "' " +
                "WHERE id=" + assetId;

        if(executeUpdateQuery(query)==0)
            return createJsonResponse(ResponseStatus.NOT_FOUND);
        else
            return createJsonResponse(ResponseStatus.SUCCESS);
    }

    @WebMethod
    public String setAssetJenis(int assetId, String jenis) throws SQLException {
        String query = "UPDATE " + ASSET_TABLE + " " +
                "SET jenis='" + jenis + "' " +
                "WHERE id=" + assetId;

        if(executeUpdateQuery(query)==0)
            return createJsonResponse(ResponseStatus.NOT_FOUND);
        else
            return createJsonResponse(ResponseStatus.SUCCESS);
    }

    @WebMethod
    public String getAssetbyKategori(String Kategori) {
        JSONArray Array;
        Array = new JSONArray();
        try {
            ResultSet resultSet;
            resultSet = executeQuery("SELECT * FROM asset WHERE Kategori = " + Kategori);

            while (resultSet.next()) {
                JSONObject object;
                object = createJSON(resultSet);
                Array.add(object);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Array.toString();
    }

    @WebMethod
    public String getAsset(String IDAsset) {
        String result = "";
        Integer i = 1;
        JSONArray Array;
        Array = new JSONArray();
        try {
            ResultSet resultSet;
            resultSet = executeQuery("SELECT * FROM asset WHERE ID = " + IDAsset);
            while (resultSet.next()) {
                JSONObject object;
                object = createJSON(resultSet);
                Array.add(object);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Array.toString();
    }


    private String getAssetVendor(String assetID) {
        String result = null;
        try {
            ResultSet resultSet;
            resultSet = executeQuery("SELECT * FROM vendor,asset WHERE asset.ID = " + assetID + " GROUP BY asset.ID");
            while (resultSet.next()) {
                result = resultSet.getString("Nama");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @WebMethod
    public String notifyVendor(String assetID) {
        return "INI METHOD NOTIFY Vendor";
    }

    @WebMethod
    public String notifyProcurement(String assetID) {
        return "INI METHOD NOTIFY Vendor";
    }

    private ResultSet executeQuery(String Query) throws SQLException {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        dbConnection = DBConnectionManager.getConnection();
        preparedStatement = dbConnection.prepareStatement(Query);
        resultSet = preparedStatement.executeQuery();

        return resultSet;
    }

    private int executeUpdateQuery(String Query) throws SQLException {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        dbConnection = DBConnectionManager.getConnection();
        preparedStatement = dbConnection.prepareStatement(Query);
        return preparedStatement.executeUpdate();
    }

    private JSONObject createJSON(ResultSet resultSet) throws SQLException {
        JSONObject object;
        object = new JSONObject();
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

    private String createJsonResponse(ResponseStatus status, Object content) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Status Code", status.getCode());
        if (status != ResponseStatus.SUCCESS) {
            Map errorMap = new HashMap<String, String>();
            errorMap.put("error", status.getResponseMessage());
            map.put("Content", errorMap);
        } else if(content!=null)
            map.put("Content", content);

        return JSONValue.toJSONString(map);
    }

    private String createJsonResponse(ResponseStatus status) {
        return createJsonResponse(status, null);
    }
}