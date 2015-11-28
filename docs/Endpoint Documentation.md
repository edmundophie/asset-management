# Endpoint Documentation

## Tipe Data
1. AssetCondtition **`Enum`**
	- `BAIK` 
	- `RUSAK`
	- `BUTUH_PERBAIKAN`
2. ResponseStatus **`Enum`**
	- `SUCCESS`
	- `NOT_FOUND`
	- `INTERNAL_SERVER_ERROR`

### KebutuhanMaintenance `sedang diimplementasi`
- ID
- IDMaintenance
- NamaItem
- Jumlah


## Endpoint Service

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

