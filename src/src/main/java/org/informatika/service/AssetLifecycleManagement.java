package org.informatika.service;

import org.informatika.service.util.DBConnectionManager;
import org.informatika.service.util.RequestCall;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.sql.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by emhah on 11/16/2015.
 */
@WebService()
public class AssetLifecycleManagement {
    private static Connection dbConnection;
    private final static String ASSET_TABLE = "asset";
    private final static String VENDOR_TABLE = "vendor";
    private final static String MAINTENANCE_TABLE = "maintenance";
    public final static String KEBUTUHAN_MAINTENANCE_TABLE = "kebutuhan_logistik_maintenance";
    private final static String FASILITAS_ASET_TABLE = "fasilitas_aset";
    private Map<Integer, Timer> maintenanceTimer;
    public AssetLifecycleManagement() {
        dbConnection = DBConnectionManager.getConnection();
        maintenanceTimer = new HashMap<Integer, Timer>();
        if (dbConnection != null) {
            System.out.println("DB connection success!");
        }
    }

    public void close() {
//        try {
//            dbConnection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @WebMethod
    public Response registerAset(String nama, String kategori, String jenis, AssetCondition kondisi, String pemilik, int idVendor, String harga, boolean isPublic) throws SQLException {
        String query = "INSERT INTO " + ASSET_TABLE + " (nama, kategori, jenis, tanggal_masuk, kondisi, pemilik, id_vendor, harga, is_public) " +
                "VALUES ('" + nama +"', '"+kategori + "', now(), '" + kondisi.getCondition() + "', '" + pemilik+ "', " + idVendor + ", '" + harga + "', "+(isPublic?"TRUE":"FALSE")+")";
        int numRowAffected = executeUpdateQueryAndGetId(query);

        if(numRowAffected>0)
            return new Response(false);
        else
            return new Response(true);
    }

    @WebMethod
    public Response insertJadwalMaintenance(int idAset, int siklus, MaintenanceCycleTimeUnit timeUnit, String keterangan) throws SQLException {
        String query = "INSERT INTO " + MAINTENANCE_TABLE + " (id_aset, siklus, satuan_waktu_siklus, keterangan) " +
                "VALUES ("+ idAset + ", " + siklus + ", '"+timeUnit.getCycle()+"', '"+ keterangan + "')";
        int numRowAffected = executeUpdateQueryAndGetRowCount(query);

        if(numRowAffected>0) {
            addMaintenanceTimer(idAset, siklus, timeUnit);
            return new Response(true);
        }
        else
            return new Response(false);
    }

    @WebMethod
    public Response registerVendor(String nama, String alamat, String telepon, String email) throws SQLException {
        String query = "INSERT INTO " + VENDOR_TABLE + " (nama, alamat, telepon, email) " +
                "VALUES ('" + nama + "', '" + alamat + "', '" + telepon+ "', '"+email+"')";

        int numRowAffected = executeUpdateQueryAndGetId(query);

        if(numRowAffected>0)
            return new Response(false);
        else
            return new Response(true);
    }

    @WebMethod
    public Response deleteAset(int idAset) throws SQLException {
        String query = "DELETE FROM " + ASSET_TABLE + " WHERE id=" + String.valueOf(idAset);
        int numRowAffected = executeUpdateQueryAndGetRowCount(query);

        if(numRowAffected>0) {
            removeMaintenanceTimer(idAset);
            return new Response(true);
        }
        else
            return new Response(false);
    }

    @WebMethod
    public Response setNamaAset(int idAset, String nama) throws SQLException {
        String query = "UPDATE " + ASSET_TABLE + " " +
                "SET nama='" + nama + "' " +
                "WHERE id=" + idAset;
        int numRowAffected = executeUpdateQueryAndGetRowCount(query);

        if(numRowAffected>0)
            return new Response(true);
        else
            return new Response(false);
    }

    @WebMethod
    public Response setPemilikAset(int idAset, String pemilik) throws SQLException {
        String query = "UPDATE " + ASSET_TABLE + " " +
                "SET pemilik='" + pemilik+ "' " +
                "WHERE id=" + idAset;
        int numRowAffected = executeUpdateQueryAndGetRowCount(query);

        if(numRowAffected>0)
            return new Response(true);
        else
            return new Response(false);
    }

    @WebMethod
    public Response setKondisiAset(int idAset, AssetCondition kondisi) throws SQLException {
        String query = "UPDATE " + ASSET_TABLE + " " +
                "SET kondisi='" + kondisi.getCondition() + "' " +
                "WHERE id=" + idAset;
        int numRowAffected = executeUpdateQueryAndGetRowCount(query);

        if(numRowAffected>0)
            return new Response(true);
        else
            return new Response(false);
    }

    @WebMethod
    public Response setJenisAset(int idAset, String jenis) throws SQLException {
        String query = "UPDATE " + ASSET_TABLE + " " +
                "SET jenis='" + jenis + "' " +
                "WHERE id=" + idAset;
        int numRowAffected = executeUpdateQueryAndGetRowCount(query);

        if(numRowAffected>0)
            return new Response(true);
        else
            return new Response(false);
    }

    @WebMethod
    public Response insertKebutuhanMaintenance(int idAset, List<Integer> idLogistik, List<Integer> jumlahKebutuhan) throws SQLException {
        String query = "INSERT INTO " + KEBUTUHAN_MAINTENANCE_TABLE + " (id_aset, id_logistik, jumlah) VALUES";

        for(int i=0;i<idLogistik.size();++i) {
            query += " (" + idAset + ", " + idLogistik.get(i) + ", " + jumlahKebutuhan.get(i) + ")";
            if(i!=idLogistik.size()-1)
                query += ",";
        }

        int numRowAffected = executeUpdateQueryAndGetRowCount(query);

        if(numRowAffected>0)
            return new Response(true);
        else
            return new Response(false);
    }

    @WebMethod
    public Response insertFasilitasAset(int idAset, List<Integer> idFasilitas) throws SQLException {
        String query = "INSERT INTO " + FASILITAS_ASET_TABLE + " (id_aset, id_fasilitas) VALUES";

        for(int i=0;i<idFasilitas.size();++i) {
            query += " (" + idAset + ", "+idFasilitas.get(i)+")";
            if(i!=idFasilitas.size()-1)
                query += ",";
        }
        System.out.println(query);
        int numRowAffected = executeUpdateQueryAndGetRowCount(query);

        if(numRowAffected>0)
            return new Response(true);
        else
            return new Response(false);
    }

    @WebMethod
    public Asset getAset(int idAset) throws SQLException {
        Asset asset = _getAset(idAset);
        return asset;
    }

    private Asset _getAset(int idAset) throws SQLException {
        String query = "SELECT * FROM "+ASSET_TABLE+" WHERE id = " + idAset;
        ResultSet rs = executeQuery(query);
        Asset asset = null;
        if(rs.next()) {
            asset = new Asset();
            asset.setId(rs.getInt("id"));
            asset.setNama(rs.getString("nama"));
            asset.setKategori(rs.getString("kategori"));
            asset.setKategori(rs.getString("jenis"));
            asset.setTanggalMasuk(rs.getDate("tanggal_masuk"));
            asset.setKondisi(AssetCondition.getInstance(rs.getString("kondisi")));
            asset.setPemilik(rs.getString("pemilik"));
            asset.setVendor(getVendorAset(rs.getInt("id_vendor")));
            asset.setHarga(rs.getString("harga"));
            asset.setPublicAsset(rs.getBoolean("is_public"));
        }

        return asset;
    }

    @WebMethod
    public List<Asset> getAsetByKategori(String kategori) throws SQLException {
        String query = "SELECT * FROM "+ASSET_TABLE+" WHERE kategori = '" + kategori + "'";
        ResultSet rs = executeQuery(query);

        List<Asset> assets = null;
        while(rs.next()) {
            if(rs.isFirst())
                assets = new ArrayList<Asset>();
            Asset asset = new Asset();
            asset.setId(rs.getInt("id"));
            asset.setNama(rs.getString("nama"));
            asset.setKategori(rs.getString("kategori"));
            asset.setKategori(rs.getString("jenis"));
            asset.setTanggalMasuk(rs.getDate("tanggal_masuk"));
            asset.setKondisi(AssetCondition.getInstance(rs.getString("kondisi")));
            asset.setPemilik(rs.getString("pemilik"));
            asset.setVendor(getVendorAset(rs.getInt("id_vendor")));
            asset.setHarga(rs.getString("harga"));
            asset.setPublicAsset(rs.getBoolean("is_public"));
            assets.add(asset);
        }

        return assets;
    }

    @WebMethod
    public Asset getAsetByNama(String nama) throws SQLException {
        String query = "SELECT * FROM " + ASSET_TABLE + " WHERE nama = '" + nama + "' LIMIT 1";
        ResultSet rs = executeQuery(query);

        Asset asset = null;
        if (rs.next()) {
            asset = new Asset();
            asset.setId(rs.getInt("id"));
            asset.setNama(rs.getString("nama"));
            asset.setKategori(rs.getString("kategori"));
            asset.setKategori(rs.getString("jenis"));
            asset.setTanggalMasuk(rs.getDate("tanggal_masuk"));
            asset.setKondisi(AssetCondition.getInstance(rs.getString("kondisi")));
            asset.setPemilik(rs.getString("pemilik"));
            asset.setVendor(getVendorAset(rs.getInt("id_vendor")));
            asset.setHarga(rs.getString("harga"));
            asset.setPublicAsset(rs.getBoolean("is_public"));
        }

        return asset;
    }

    @WebMethod
    public List<Asset> getAsetByJenis(String jenis) throws SQLException {
        String query = "SELECT * FROM " + ASSET_TABLE + " WHERE jenis= '" + jenis+ "'";
        ResultSet rs = executeQuery(query);

        List<Asset> assets = null;
        while(rs.next()) {
            if(rs.isFirst())
                assets = new ArrayList<Asset>();
            Asset asset = new Asset();
            asset.setId(rs.getInt("id"));
            asset.setNama(rs.getString("nama"));
            asset.setKategori(rs.getString("kategori"));
            asset.setKategori(rs.getString("jenis"));
            asset.setTanggalMasuk(rs.getDate("tanggal_masuk"));
            asset.setKondisi(AssetCondition.getInstance(rs.getString("kondisi")));
            asset.setPemilik(rs.getString("pemilik"));
            asset.setVendor(getVendorAset(rs.getInt("id_vendor")));
            asset.setHarga(rs.getString("harga"));
            asset.setPublicAsset(rs.getBoolean("is_public"));
            assets.add(asset);
        }

        return assets;
    }

    @WebMethod
    public List<Asset> getFasilitasAset(int idAset) throws SQLException {
        String query = "SELECT *  FROM "+FASILITAS_ASET_TABLE+
                " JOIN "+ASSET_TABLE+" ON " +FASILITAS_ASET_TABLE+".id_fasilitas="+ASSET_TABLE+".id" +
                " WHERE id_aset = " + idAset;
        System.out.println(query);
        ResultSet rs = executeQuery(query);

        List<Asset> assets = null;
        while(rs.next()) {
            if(rs.isFirst())
                assets = new ArrayList<Asset>();
            Asset asset = new Asset();
            asset.setId(rs.getInt("id"));
            asset.setNama(rs.getString("nama"));
            asset.setKategori(rs.getString("kategori"));
            asset.setKategori(rs.getString("jenis"));
            asset.setTanggalMasuk(rs.getDate("tanggal_masuk"));
            asset.setKondisi(AssetCondition.getInstance(rs.getString("kondisi")));
            asset.setPemilik(rs.getString("pemilik"));
            asset.setVendor(getVendorAset(rs.getInt("id_vendor")));
            asset.setHarga(rs.getString("harga"));
            asset.setPublicAsset(rs.getBoolean("is_public"));
            assets.add(asset);
        }
        return assets;
    }

    private Vendor getVendorAset(int idVendor) throws SQLException {
        String query = "SELECT * FROM "+VENDOR_TABLE+" WHERE id = " + idVendor;
        ResultSet rs = executeQuery(query);
        Vendor vendor = null;
        if(rs.next()) {
            vendor = new Vendor();
            vendor.setId(rs.getInt("id"));
            vendor.setNama(rs.getString("nama"));
            vendor.setAlamat(rs.getString("alamat"));
            vendor.setTelepon(rs.getString("telepon"));
            vendor.setEmail(rs.getString("email"));

        }
        return vendor;
    }

    @WebMethod
    public Response<String> notifyMaintenanceToVendor(int idAset) throws SQLException {
        Asset asset = _getAset(idAset);
        if(asset!=null) {
            String to = asset.getVendor().getEmail();
            String subject = "Permintaan Maintenance Aset";
            String content = "Tolong aset berikut dicek: \n";
            content += "Id aset: " + asset.getId() + "\n";
            content += "Nama aset: " + asset.getNama() + "\n";
            content += "Kondisi aset: " + asset.getKondisi() + "\n";
            content += "Terima kasih.\n\n Salam,\n\n Asset Maintenance Notifier";
            RequestCall.sendEmail(to, subject, content);

            return new Response(true, "Notifikasi berhasil");
        }
        else
            return new Response<String>(false, "Aset tidak ditemukan");
    }

    public static ResultSet executeQuery(String query) throws SQLException {
        Statement stmt = dbConnection.createStatement();
        return stmt.executeQuery(query);
    }

    private int executeUpdateQueryAndGetId(String query) throws SQLException {
        Statement stmt = dbConnection.createStatement();
        return  stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
    }

    private int executeUpdateQueryAndGetRowCount(String query) throws SQLException {
        PreparedStatement preparedStatement;
        Statement stmt = dbConnection.createStatement();
        return stmt.executeUpdate(query);
    }

    private void initMaintenanceScheduler() throws SQLException {
        String query = "SELECT * FROM "+MAINTENANCE_TABLE;
        ResultSet rs = executeQuery(query);
        while(rs.next()) {
            MaintenanceTask mt = new MaintenanceTask();
            mt.setAssetId(rs.getInt("id_aset"));
            mt.setCycleTime(rs.getInt("siklus"));
            MaintenanceCycleTimeUnit cycleTimeUnit = MaintenanceCycleTimeUnit.getInstance(rs.getString("satuan_waktu_siklus"));
            mt.setTimeUnit(cycleTimeUnit);

            Timer timer = new Timer();
            maintenanceTimer.put(mt.getAssetId(), timer);
            timer.schedule(mt, 0, mt.getTimeUnit().toMillis(mt.getCycleTime()));
        }
    }

    private void addMaintenanceTimer(int idAset, int siklus, MaintenanceCycleTimeUnit timeUnit) {
        MaintenanceTask mt = new MaintenanceTask();
        mt.setAssetId(idAset);
        mt.setCycleTime(siklus);
        mt.setTimeUnit(timeUnit);

        if(maintenanceTimer.containsKey(mt.getAssetId())) {
            maintenanceTimer.get(idAset).cancel();
            maintenanceTimer.get(idAset).purge();
        }
        Timer timer = new Timer();
        maintenanceTimer.put(mt.getAssetId(), timer);
        timer.schedule(mt, 0, mt.getTimeUnit().toMillis(mt.getCycleTime()));
    }

    private void removeMaintenanceTimer(int idAset) {
        if(maintenanceTimer.containsKey(idAset)) {
            maintenanceTimer.get(idAset).cancel();
            maintenanceTimer.get(idAset).purge();
            maintenanceTimer.remove(idAset);
        }
    }

    @WebMethod
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] argv) throws SQLException {
        AssetLifecycleManagement implementor = new AssetLifecycleManagement();
        implementor.initMaintenanceScheduler();
        String address = "http://localhost:9000/AssetLifecycleManagement";
        Endpoint.publish(address, implementor);
        implementor.close();
    }
}