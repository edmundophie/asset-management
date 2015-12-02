package org.informatika.service;

import java.util.Date;

/**
 * Created by edmundophie on 12/1/15.
 */
public class Asset {
    private int id;
    private String nama;
    private String kategori;
    private Date tanggalMasuk;
    private AssetCondition kondisi;
    private String pemilik;
    private Vendor vendor;
    private String harga;
    private boolean publicAsset;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public AssetCondition getKondisi() {
        return kondisi;
    }

    public void setKondisi(AssetCondition kondisi) {
        this.kondisi = kondisi;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public boolean isPublicAsset() {
        return publicAsset;
    }

    public void setPublicAsset(boolean publicAsset) {
        this.publicAsset = publicAsset;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
