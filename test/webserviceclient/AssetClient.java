package webserviceclient;

import asset.AssetLifecycleManagement;
import asset.AssetLifecycleManagementService;

/**
 * Created by baharudinafif on 11/21/15.
 */
public class AssetClient {
    public static void main(String[] argv) {
        AssetLifecycleManagement service = new AssetLifecycleManagementService().getAssetLifecycleManagementPort();
        //invoke business method
        String result = service.getAsset("1");
        System.out.println(result);
        service.close();
    }
}
