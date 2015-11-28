# Dokumentasi Teknis

## Tipe Data

### Asset 
- ID
- Kategori
- Tanggal Masuk
- Kondisi
- Institusi
- Jenis
- IDVendor
- Harga
- IsPublik `sedang diimplementasi`

### Maintenance
- ID
- IDVendor
- IDAsset
- Jadwal
- Catatan

### KebutuhanMaintenance `sedang diimplementasi`
- ID
- IDMaintenance
- NamaItem
- Jumlah

### Vendor
- ID
- Nama
- Alamat
- Kontak

### Endpoint Service

- [registerAsset]()  
Melakukan entry aset baru ke database  
- [insertMaintenanceSchedule]():  
Melakukan entry jadwal maintenance suatu aset ke ke database  
- [registerVendor]()  
Melakukan entry vendor baru ke database  
- [deleteAsset]()  
Menghapus entry suatu aset dari database  
- [setAssetOwner]()  
Mengupdate `institusi` atau pemilik dari suatu aset  
- [setAssetCondition]()  
Mengupdate `kondisi` dari suatu aset  
- [setAssetJenis]()  
Mengupdate `jenis` dari suatu aset  
- [getAssetbyKategori]()   
- [getAsset]()   
- [notifyVendor]()   
- [notifyProcurement]()  

