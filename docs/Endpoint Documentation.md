# Endpoint Documentation

## DB Schema
![](http://gitlab.informatika.org/IF4050/AssetLifecycleManagementService/blob/master/docs/images/db%20entities.png)

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
- [insertMaintenanceSchedule](#insertMaintenanceSchedule)  
Melakukan entry jadwal maintenance suatu aset ke ke database  
- [registerVendor](#registerVendor)  
Melakukan entry vendor baru ke database  
- [deleteAsset](#deleteAsset)  
Menghapus entry suatu aset dari database  
- [setAssetOwner](#setAssetOwner)  
Mengupdate `institusi` atau pemilik dari suatu aset  
- [setAssetCondition](#setAssetCondition)  
Mengupdate `kondisi` dari suatu aset  
- [setAssetJenis](#setAssetJenis)  
Mengupdate `jenis` dari suatu aset  
- [getAssetbyKategori](#getAssetbyKategori)   
- [getAsset](#getAsset)   
- [notifyVendor](#notifyVendor)   
- [notifyProcurement](#notifyProcurement)  


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
	`on success`:

	```
	{
		"status":200
	}
	```

	`on failed`:

	```
	{
		"status": 404 or 500,
		"content": {
			"error": "Error Reason"
		}
	}
	```

### <a name="insertMaintenanceSchedule">insertMaintenanceSchedule</a>
- Required parameter:  
	1. `int` idvendor
	2. `int` idasset
	3. `int` jadwalMaintenance
	4. `String` catatan
- Return type	: `String`  
- Return value:  
	`on success`:

	```
	{
		"status":200
	}
	```

	`on failed`:

	```
	{
		"status": 404 or 500,
		"content": {
			"error": "Error Reason"
		}
	}
	```

### <a name="registerVendor">registerVendor</a>
- Required parameter:  
	1. `String` nama
	2. `String` alamat
	3. `String` kontak
- Return type	: `String`  
- Return value:  
	`on success`:

	```
	{
		"status":200
	}
	```

	`on failed`:

	```
	{
		"status": 404 or 500,
		"content": {
			"error": "Error Reason"
		}
	}
	```

### <a name="deleteAsset">deleteAsset</a>
- Required parameter:  
	1. `int` idAsset
- Return type	: `String`  
- Return value:  
	`on success`:

	```
	{
		"status":200
	}
	```

	`on failed`:

	```
	{
		"status": 404 or 500,
		"content": {
			"error": "Error Reason"
		}
	}
	```

### <a name="setAssetOwner">setAssetOwner</a>
- Required parameter:  
	1. `int` assetId
	2. `String` assetOwner
- Return type	: `String`  
- Return value:  
	`on success`:

	```
	{
		"status":200
	}
	```

	`on failed`:

	```
	{
		"status": 404 or 500,
		"content": {
			"error": "Error Reason"
		}
	}
	```
	
### <a name="setAssetCondition">setAssetCondition</a>
- Required parameter:  
	1. `int` assetId
	2. `AssetCondition` condition
- Return type	: `String`  
- Return value:  
	`on success`:

	```
	{
		"status":200
	}
	```

	`on failed`:

	```
	{
		"status": 404 or 500,
		"content": {
			"error": "Error Reason"
		}
	}
	```
	
### <a name="setAssetJenis">setAssetJenis</a>
- Required parameter:  
	1. `int` assetId
	2. `String` jenis
- Return type	: `String`  
- Return value:  
	`on success`:

	```
	{
		"status":200
	}
	```

	`on failed`:

	```
	{
		"status": 404 or 500,
		"content": {
			"error": "Error Reason"
		}
	}
	```
	
### <a name="getAssetbyKategori">getAssetbyKategori</a>

### <a name="getAsset">getAsset</a>

### <a name="notifyVendor">notifyVendor</a>

### <a name="notifyProcurement">notifyProcurement</a>