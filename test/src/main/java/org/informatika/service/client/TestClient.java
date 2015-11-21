package org.informatika.service.client;


import org.informatika.client.AssetCondition;
import org.informatika.client.AssetLifecycleManagement;
import org.informatika.client.AssetLifecycleManagementService;
import org.informatika.client.SQLException_Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                    registerAsset();
                    break;
                case 3:
                    insertMaintenanceSchedule();
                    break;
                case 4:
                    updateAssetOwner();
                    break;
                case 5:
                    updateAssetCondition();
                    break;
                case 6:
                    updateAssetJenis();
                    break;
                case 7:
                    deleteAsset();
                    break;
                case 99:
                    break;
                default:
                    System.err.println("Input salah!");
                    break;
            }
            System.out.println();
        } while (input!=99);
        service.close();
    }

    private static void printMenu() {
        System.out.println("Which method do you want to test?");
        System.out.println("1. Registrasi vendor");
        System.out.println("2. Registrasi asset");
        System.out.println("3. Masukkan jadwal maintenance");
        System.out.println("4. Update pemilik aset");
        System.out.println("5. Update kondisi aset");
        System.out.println("6. Update jenis aset");
        System.out.println("7. Hapus aset");
        System.out.println("99. Exit");
        System.out.print("Pilihan anda (1-7): ");
    }

    private static void registerVendor() throws IOException, SQLException_Exception {
        String nama, alamat, kontak;

        System.out.print("Nama vendor: ");
        nama = reader.readLine().trim();

        System.out.print("Alamat: ");
        alamat = reader.readLine().trim();

        System.out.print("Kontak: ");
        kontak = reader.readLine().trim();

        String response = service.registerVendor(nama, alamat, kontak);
        System.out.println("Reponse endpoint: " + response);
    }

    private static void registerAsset() throws IOException, SQLException_Exception {
        String kategori,  institusi,  jenis, harga;
        AssetCondition kondisi;
        int idVendor;

        System.out.print("ID Vendor: ");
        idVendor  = Integer.parseInt(reader.readLine().trim());

        System.out.print("Jenis aset (e.g. Meja, mobil): ");
        jenis = reader.readLine().trim();

        System.out.print("Kategori (e.g. equipment, fixed asset): ");
        kategori = reader.readLine().trim();

        System.out.print("Pemilik: ");
        institusi = reader.readLine().trim();

        System.out.print("Harga: ");
        harga= reader.readLine().trim();

        System.out.println("Kondisi aset: ");
        System.out.println("1. Baik");
        System.out.println("2. Rusak");
        System.out.println("3. Butuh Perbaikan");
        System.out.print("Pilihan kondisi: ");
        int cond = Integer.parseInt(reader.readLine().trim());

        switch (cond) {
            case 1: kondisi = AssetCondition.BAIK;break;
            case 2: kondisi = AssetCondition.RUSAK;break;
            case 3: kondisi = AssetCondition.BUTUH_PERBAIKAN;break;
            default: kondisi = AssetCondition.BAIK;
        }

        String response = service.registerAsset(kategori, kondisi, institusi, jenis, idVendor, harga);
        System.out.println("Reponse endpoint: " + response);
    }

    private static void insertMaintenanceSchedule() throws IOException, SQLException_Exception {
        int idVendor, idAsset, jadwalMaintenance;
        String catatan;

        System.out.print("ID vendor: ");
        idVendor  = Integer.parseInt(reader.readLine().trim());

        System.out.print("ID aset: ");
        idAsset = Integer.parseInt(reader.readLine().trim());

        System.out.print("Siklus maintenance (hari): ");
        jadwalMaintenance = Integer.parseInt(reader.readLine().trim());

        System.out.print("Catatan maintenance: ");
        catatan = reader.readLine().trim();

        String response = service.insertMaintenanceSchedule(idVendor, idAsset, jadwalMaintenance, catatan);
        System.out.println("Reponse endpoint: " + response);
    }

    private static void updateAssetOwner() throws IOException, SQLException_Exception {
        int idAsset;
        String assetOwner;

        System.out.print("ID aset: ");
        idAsset = Integer.parseInt(reader.readLine().trim());

        System.out.print("Pemilik aset: ");
        assetOwner = reader.readLine().trim();

        String response = service.setAssetOwner(idAsset, assetOwner);
        System.out.println("Reponse endpoint: " + response);
    }

    private static void updateAssetCondition() throws IOException, SQLException_Exception {
        int idAsset;
        AssetCondition kondisi;

        System.out.print("ID aset: ");
        idAsset = Integer.parseInt(reader.readLine().trim());

        System.out.println("Kondisi aset: ");
        System.out.println("1. Baik");
        System.out.println("2. Rusak");
        System.out.println("3. Butuh Perbaikan");
        System.out.print("Pilihan kondisi: ");
        int cond = Integer.parseInt(reader.readLine().trim());

        switch (cond) {
            case 1: kondisi = AssetCondition.BAIK;break;
            case 2: kondisi = AssetCondition.RUSAK;break;
            case 3: kondisi = AssetCondition.BUTUH_PERBAIKAN;break;
            default: kondisi = AssetCondition.BAIK;
        }

        String response = service.setAssetCondition(idAsset, kondisi);
        System.out.println("Reponse endpoint: " + response);
    }

    private static void updateAssetJenis() throws IOException, SQLException_Exception {
        int idAsset;
        String jenis;

        System.out.print("ID aset: ");
        idAsset = Integer.parseInt(reader.readLine().trim());

        System.out.print("Jenis aset: ");
        jenis = reader.readLine().trim();

        String response = service.setAssetJenis(idAsset, jenis);
        System.out.println("Reponse endpoint: " + response);
    }

    private static void deleteAsset() throws IOException, SQLException_Exception {
        int idAsset;

        System.out.print("ID aset: ");
        idAsset = Integer.parseInt(reader.readLine().trim());

        String response = service.deleteAsset(idAsset);
        System.out.println("Reponse endpoint: " + response);
    }
}
