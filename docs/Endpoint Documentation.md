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

## Endpoint Service

- [registerAsset](#registerAsset)  
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


### <a name="registerAsset">registerAsset</a>
Return type: `String`  
Return value:  
`on success`:

```
{
	"status":200
}
```

`on failed`:

```
{
	"status": 404 or 500
	"content": {
		"error": "Error Reason"
	}
}
```

Required parameter:  
1. `String` kategori  
2. `AssetCondition` kondisi  
3. `String` institusi  
4. `String` jenis  
5. `int` idvendor  
6. `String` harga  

### insertMaintenanceSchedule
