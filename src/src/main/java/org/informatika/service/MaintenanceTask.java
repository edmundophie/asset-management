package org.informatika.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by edmundophie on 12/1/15.
 */
public class MaintenanceTask extends TimerTask{
    private int assetId;
    private long cycleTime;
    private MaintenanceCycleTimeUnit timeUnit;

    public long getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(long cycleTime) {
        this.cycleTime = cycleTime;
    }

    public MaintenanceCycleTimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(MaintenanceCycleTimeUnit timeunit) {
        this.timeUnit = MaintenanceCycleTimeUnit.getInstance(timeunit.getCycle());
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    @Override
    public void run() {
        System.out.println("Asset id: " + assetId + " maintenance is started");
        List<Integer> logisticIds = new ArrayList<Integer>();
        String query = "SELECT * FROM "+AssetLifecycleManagement.KEBUTUHAN_MAINTENANCE_TABLE+" WHERE id_aset=" + assetId;
        try {
            ResultSet rs = AssetLifecycleManagement.executeQuery(query);
            while(rs.next()) {
                logisticIds.add(rs.getInt("id_logistik"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        boolean isLogisticEnough = true;
        for(int logisticId:logisticIds) {
            if(!stubLogisticCheckQty(logisticId, 2)) {
                isLogisticEnough = false;
                break;
            }
        }

        if(isLogisticEnough) {
            for(int logisticId:logisticIds)
                stubLogisticRemove(logisticId, 2);
            System.out.println("Asset id: " + assetId + " maintenance is completed");
        }
        else {
            System.out.println("Asset id: " + assetId + " maintenance is failed.\n Not enough logistic resource");
        }
    }

    private boolean stubLogisticCheckQty(int idLogistik, int qty) {
        return true;
    }

    private boolean stubLogisticRemove(int idLogistik, int qty) {
        System.out.println("Removed logistic with id: " + idLogistik);
        return true;
    }
}
