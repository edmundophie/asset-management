package org.informatika.service.client;


import org.informatika.client.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by edmundophie on 11/21/15.
 */
public class TestClient {
    private static AssetLifecycleManagement service;
    private static BufferedReader reader;

    public static void main(String[] argv) throws SQLException_Exception, IOException {
        service = new AssetLifecycleManagementService().getAssetLifecycleManagementPort();
        reader = new BufferedReader(new InputStreamReader(System.in));

        int input;
        do {
            printMenu();

            input = Integer.parseInt(reader.readLine().trim());
            switch (input) {
                case 1:
                    registerVendor();
                    break;
                case 2:
                    registerAset();
                    break;
                case 3:
                    insertJadwalMaintenance();
                    break;
                case 4:
                    insertKebutuhanMaintenance();
                    break;
                case 5:
                    insertFasilitasAset();
                    break;
                case 6:
                    updateNamaAset();
                    break;
                case 7:
                    updateKondisiAsset();
                    break;
                case 8:
                    updatePemilikAset();
                    break;
                case 9:
                    deleteAset();
                    break;
                case 10:
                    getAset();
                    break;
                case 11:
                    getAsetByNama();
                    break;
                case 12:
                    getAsetByKategori();
                    break;
                case 13:
                    getAsetByJenis();
                    break;
                case 14:
                    getFasilitasAset();
                    break;
                case 15:
                    notifyMaintenanceToVendor();
                    break;
                case 99:
                    break;
                default:
                    System.err.println("Input salah!");
                    break;
            }
            System.out.println();
        } while (input != 99);
        service.close();
    }

    private static void printMenu() {
        System.out.println("Which method do you want to test?");
        System.out.println("1. Registrasi vendor");
        System.out.println("2. Registrasi asset");
        System.out.println("3. Masukkan jadwal maintenance");
        System.out.println("4. Masukkan kebutuhan maintenance");
        System.out.println("5. Masukkan fasilitas aset");
        System.out.println("6. Update nama aset");
        System.out.println("7. Update kondisi aset");
        System.out.println("8. Update pemilik aset");
        System.out.println("9. Hapus aset");
        System.out.println("10. Dapatkan aset berdasarkan id");
        System.out.println("11. Dapatkan aset berdasarkan nama");
        System.out.println("12. Dapatkan list aset berdasarkan kategori");
        System.out.println("13. Dapatkan list aset berdasarkan jenis");
        System.out.println("14. Dapatkan list fasilitas aset");
        System.out.println("15. Notifikasi maintenance ke vendor");
        System.out.println("99. Exit");
        System.out.print("Pilihan anda (1-12): ");
    }

    private static void registerVendor() throws IOException, SQLException_Exception {
        String nama, alamat, telepon, email;

        System.out.print("Nama vendor: ");
        nama = reader.readLine().trim();

        System.out.print("Alamat: ");
        alamat = reader.readLine().trim();

        System.out.print("Telepon: ");
        telepon = reader.readLine().trim();

        System.out.print("Email: ");
        email = reader.readLine().trim();

        Response response = service.registerVendor(nama, alamat, telepon, email);
        if(response.isSuccess())
            System.out.println("Vendor berhasil didaftarkan");
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void registerAset() throws IOException, SQLException_Exception {
        String nama, kategori, jenis, pemilik, harga;
        AssetCondition kondisi;
        int idVendor;
        boolean isPublic;

        System.out.print("ID Vendor: ");
        idVendor = Integer.parseInt(reader.readLine().trim());

        System.out.print("Nama aset (e.g. Meja, mobil, Balai Sarbini): ");
        nama = reader.readLine().trim();

        System.out.print("Kategori (e.g. equipment, fixed asset): ");
        kategori = reader.readLine().trim();

        System.out.print("Jenis: ");
        jenis = reader.readLine().trim();

        System.out.print("Pemilik: ");
        pemilik = reader.readLine().trim();

        System.out.print("Harga: ");
        harga = reader.readLine().trim();

        System.out.println("Kondisi aset: ");
        System.out.println("1. Baik");
        System.out.println("2. Rusak");
        System.out.println("3. Butuh Perbaikan");
        System.out.print("Pilihan kondisi: ");
        int cond = Integer.parseInt(reader.readLine().trim());

        switch (cond) {
            case 1:
                kondisi = AssetCondition.BAIK;
                break;
            case 2:
                kondisi = AssetCondition.RUSAK;
                break;
            case 3:
                kondisi = AssetCondition.BUTUH_PERBAIKAN;
                break;
            default:
                kondisi = AssetCondition.BAIK;
        }

        System.out.print("Apakah aset bersifat publik? (y/n): ");
        isPublic = reader.readLine().trim().equalsIgnoreCase("y");

        Response response = service.registerAset(nama, kategori, jenis, kondisi, pemilik, idVendor, harga, isPublic);

        if(response.isSuccess())
            System.out.println("Aset berhasil didaftarkan");
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void insertJadwalMaintenance() throws IOException, SQLException_Exception {
        int idVendor, idAset, siklusMaintenance;
        MaintenanceCycleTimeUnit timeUnit;
        String keterangan;

        System.out.print("ID aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        System.out.print("Siklus maintenance): ");
        siklusMaintenance = Integer.parseInt(reader.readLine().trim());


        System.out.println("Satuan waktu siklus: ");
        System.out.println("1. Detik");
        System.out.println("2. Menit");
        System.out.println("3. Jam");
        System.out.println("4. Hari");
        System.out.println("5. Bulan");
        System.out.println("6. Tahun");
        System.out.print("Pilihan kondisi: ");

        int opt = Integer.parseInt(reader.readLine().trim());

        switch (opt) {
            case 1:
                timeUnit = MaintenanceCycleTimeUnit.SECONDS;
                break;
            case 2:
                timeUnit = MaintenanceCycleTimeUnit.MINUTES;
                break;
            case 3:
                timeUnit = MaintenanceCycleTimeUnit.HOURS;
                break;
            case 4:
                timeUnit = MaintenanceCycleTimeUnit.DAYS;
                break;
            case 5:
                timeUnit = MaintenanceCycleTimeUnit.MONTHS;
                break;
            case 6:
                timeUnit = MaintenanceCycleTimeUnit.YEARS;
                break;
            default:
                timeUnit = MaintenanceCycleTimeUnit.DAYS;
        }

        System.out.print("Keterangan maintenance: ");
        keterangan = reader.readLine().trim();

        Response response = service.insertJadwalMaintenance(idAset, siklusMaintenance, timeUnit, keterangan);

        if(response.isSuccess())
            System.out.println("Jadwal maintenance berhasil ditambahkan");
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void insertKebutuhanMaintenance() throws IOException, SQLException_Exception {
        int idAset;

        System.out.print("ID Aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        System.out.println("Masukkan jumlah kebutuhan logistik yang ingin dientry: ");
        int n =  Integer.parseInt(reader.readLine().trim());

        List<Integer> idLogistik = new ArrayList<Integer>();
        List<Integer> qtyLogistik = new ArrayList<Integer>();

        int id, qty;
        for(int i=0;i<n;++i) {
            System.out.print("ID Logistik: ");
            id = Integer.parseInt(reader.readLine().trim());

            System.out.print("Kuantitas logistik dibutuhkan: ");
            qty = Integer.parseInt(reader.readLine().trim());
            idLogistik.add(id);
            qtyLogistik.add(qty);
        }

        Response response = service.insertKebutuhanMaintenance(idAset, idLogistik, qtyLogistik);

        if(response.isSuccess())
            System.out.println("Kebutuhan maintenance berhasil ditambahkan");
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void insertFasilitasAset() throws IOException, SQLException_Exception {
        int idAset;
        List<Integer> idFasilitas = new ArrayList<Integer>();

        System.out.print("ID Aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        System.out.print("Jumlah fasilitas yg ingin dimasukkan: ");
        int jumFasilitas = Integer.parseInt(reader.readLine().trim());

        while(jumFasilitas>0) {
            System.out.print("ID Fasilitas: ");
            int id = Integer.parseInt(reader.readLine().trim());
            idFasilitas.add(id);
            --jumFasilitas;
        }

        Response response = service.insertFasilitasAset(idAset, idFasilitas);

        if(response.isSuccess())
            System.out.println("Fasilitas aset berhasil ditambahkan");
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void updateNamaAset() throws IOException, SQLException_Exception {
        int idAset;
        String nama;

        System.out.print("ID aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        System.out.print("Nama aset: ");
        nama = reader.readLine().trim();

        Response response = service.setNamaAset(idAset, nama);

        if(response.isSuccess())
            System.out.println("Nama aset berhasil diupdate");
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void updatePemilikAset() throws IOException, SQLException_Exception {
        int idAset;
        String pemilikAset;

        System.out.print("ID aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        System.out.print("Pemilik aset: ");
        pemilikAset = reader.readLine().trim();

        Response response = service.setPemilikAset(idAset, pemilikAset);

        if(response.isSuccess())
            System.out.println("Pemilik aset berhasil diupdate");
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void updateKondisiAsset() throws IOException, SQLException_Exception {
        int idAset;
        AssetCondition kondisi;

        System.out.print("ID aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        System.out.println("Kondisi aset: ");
        System.out.println("1. Baik");
        System.out.println("2. Rusak");
        System.out.println("3. Butuh Perbaikan");
        System.out.print("Pilihan kondisi: ");
        int cond = Integer.parseInt(reader.readLine().trim());

        switch (cond) {
            case 1:
                kondisi = AssetCondition.BAIK;
                break;
            case 2:
                kondisi = AssetCondition.RUSAK;
                break;
            case 3:
                kondisi = AssetCondition.BUTUH_PERBAIKAN;
                break;
            default:
                kondisi = AssetCondition.BAIK;
        }

        Response response = service.setKondisiAset(idAset, kondisi);

        if(response.isSuccess())
            System.out.println("Kondisi aset berhasil diupdate");
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void deleteAset() throws IOException, SQLException_Exception {
        int idAset;

        System.out.print("ID aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        Response response = service.deleteAset(idAset);

        if(response.isSuccess())
            System.out.println("Kondisi aset berhasil diupdate");
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void getAset() throws IOException, SQLException_Exception {
        int idAset;
        System.out.print("ID aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        Asset asset = service.getAset(idAset);

        if(asset!=null) {
            System.out.println("Aset berhasil ditemukan");
            System.out.println("Nama aset: " + asset.getNama());
            System.out.println("Nama vendor: " + asset.getVendor().getNama());
        }
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void getAsetByNama() throws IOException, SQLException_Exception {
        String nama;
        System.out.print("Nama aset: ");
        nama = reader.readLine().trim();

        Asset asset = service.getAsetByNama(nama);

        if(asset!=null) {
            System.out.println("Aset berhasil ditemukan");
            System.out.println("ID aset: " + asset.getId());
        }
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void getAsetByKategori() throws IOException, SQLException_Exception {
        String kategori;
        System.out.print("Kategori aset: ");
        kategori = reader.readLine().trim();

        List<Asset> assets = service.getAsetByKategori(kategori);

        if(assets!=null) {
            System.out.println("Aset berhasil ditemukan");
            for(Asset asset:assets)
                System.out.println("Nama aset: " + asset.getNama());
        }
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void getAsetByJenis() throws IOException, SQLException_Exception {
        System.out.print("Jenis aset: ");
        String jenis = reader.readLine().trim();

        List<Asset> assets = service.getAsetByJenis(jenis);

        if(assets!=null) {
            System.out.println("Aset berhasil ditemukan");
            for(Asset asset:assets)
                System.out.println("Nama aset: " + asset.getNama());
        }
        else
            System.out.println("Endpoint gagal melakukan operasi");
    }

    private static void getFasilitasAset() throws IOException, SQLException_Exception {
        int idAset;
        System.out.print("ID aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        List<Asset> assets = service.getFasilitasAset(idAset);

        if(assets!=null) {
            System.out.println("Fasilitas aset berhasil ditemukan");
            for(Asset asset:assets)
                System.out.println("Nama fasiltias: " + asset.getNama());
        }
        else
            System.out.println("Endpoint gagalmelakukan operasi atau tidak menemukan fasilitas");
    }

    private static void notifyMaintenanceToVendor() throws IOException, SQLException_Exception {
        int idAset;
        System.out.print("ID aset: ");
        idAset = Integer.parseInt(reader.readLine().trim());

        Response response = service.notifyMaintenanceToVendor(idAset);

        if(response.isSuccess())
            System.out.println("Vendor berhasil dinotifikasi");
        else
            System.out.println(response.getReturnValue());
    }
}
