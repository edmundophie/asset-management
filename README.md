# Asset Lifecycle Management Service
A simple service for asset management using SOAP

## Deskripsi Service
Asset Lifecycle Management Service menyediakan layanan registrasi aset, pemantauan aset, permintaan pengecekan asset hingga permintaan pembelian aset baru.

## Fungsi Utama Service
- Registrasi aset baru
- Memantau kondisi aset
- Melakukan pengecekan (maintenance) terhadap aset
- Melakukan perbaikan terhadap aset
- Mengirimkan permintaan pembelian aset baru

## Potensi Interaksi dengan Sistem Lain
- Procurement Service

## System Requirement
 - JDK >= 1.7
 - [Maven](https://maven.apache.org/download.cgi) 
 - Mysql
 
## How to Build The Service
**Prerequirement: from the`/data` folder, import `assetamanagementdb.sql` to your MySQL**

1. Go to `/src` folder in terminal
2. Resolve maven dependency  

	 ```
	 $ mvn dependency:copy-dependencies
	 ```
3. Build `jar` using maven `mvn`  

	 ```
	 $ mvn package
	 ```

## How to Run	The Service
1. Go to `/src` folder in terminal
2. Run `AssetLifecycleManagement` from the generated `jar` in `target` folder  

	 ```
	 $ java -cp target/dependency/*:target/asset-lifecycle-management-service-1.0.jar org.informatika.service.AssetLifecycleManagement
	 ```

## How to Test The Service
1. Build client for testing from the `/test` folder

	 ```
	 $ mvn package
	 ```
2. Run `TestClient` from the generated `jar` in `target` folder  

     ```
	 $ java -cp target/asset-lifecycle-management-service-client-1.0.jar org.informatika.service.client.TestClient
     ```
3. The test client is ready. You can now test the service by selecting the method you want

## More Documentation
Please refer to [Wiki](http://gitlab.informatika.org/IF4050/AssetLifecycleManagementService/wikis/home) for detailed documentation.

## Team Member
- Baharudin Afif / 13511021
- Edmund Ophie / 13512095
- Muhammad Husain Jakfari /13512067