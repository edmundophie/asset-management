# Endpoint Documentation

## DB Schema
![1](images/db_entities.png)

## Tipe Data
1. Asset
    - `int` id
    - `String` nama
    - `String` kategori
    - `Date` tanggalMasuk
    - `AssetCondition` kondisi
    - `String` pemilik
    - `Vendor` vendor
    - `String` harga
    - `boolean` publicAsset
2. Vendor
    - `int` id
    - `String` nama
    - `String` alamat
    - `String` telepon
    - `String` email
3. MaintenanceCycleTimeUnit **`Enum`**
	- `SECONDS` 
	- `MINUTES`
	- `HOURS`
	- `DAYS`
	- `MONTHS`
	- `YEARS`
4. AssetCondtition **`Enum`**
	- `BAIK` 
	- `RUSAK`
	- `BUTUH_PERBAIKAN`
5. Response

## Endpoint Service

- [registerAsset](#registerAsset)  
Melakukan entry aset baru ke database  
- [insertJadwalMaintenance](#insertJadwalMaintenance)  
Melakukan entry jadwal maintenance suatu aset ke ke database  
- [registerVendor](#registerVendor)  
Melakukan entry vendor baru ke database  
- [deleteAsset](#deleteAsset)  
Menghapus entry suatu aset dari database    
- [setNamaAset](#setNamaAset)  
Lorem ipsum...
- [setPemilikAset](#setPemilikAset)  
Mengupdate `institusi` atau pemilik dari suatu aset  
- [setKondisiAset](#setKondisiAset)  
Mengupdate `kondisi` dari suatu aset  
- [setJenisAset](#setJenisAset)  
Mengupdate `jenis` dari suatu aset  
- [insertKebutuhanMaintenance](#insertKebutuhanMaintenance)  
Lorem ipsum...
- [insertFasilitasAset](#insertFasilitasAset)  
Lorem ipsum...
- [getAset](#getAset)   
Lorem ipsum...
- [getAsetByKategori](#getAsetByKategori)   
Lorem ipsum...
- [getAsetByNama](#getAsetByNama)   
Lorem ipsum...
- [getAsetByJenis](#getAsetByJenis)   
Lorem ipsum...
- [getFasilitasAset](#getFasilitasAset)   
Lorem ipsum...
- [notifyMaintenanceToVendor](#notifyMaintenanceToVendor)   


## Endpoint Service Detail

### <a name="registerAsset">registerAsset</a>
- Required parameter:  
	1. `String` kategori  
	2. `AssetCondition` kondisi  
	3. `String` institusi  
	4. `String` jenis  
	5. `int` idvendor  
	6. `String` harga  
- Return type	: `String`  
- Return value:  