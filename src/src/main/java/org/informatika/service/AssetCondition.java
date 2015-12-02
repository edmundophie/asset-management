package org.informatika.service;

/**
 * Created by edmundophie on 12/1/15.
 */
public  enum AssetCondition {
    BAIK("BAIK"),
    RUSAK("RUSAK"),
    BUTUH_PERBAIKAN("BUTUH PERBAIKAN");

    private final String condition;

    private AssetCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return this.condition;
    }

    public static AssetCondition getInstance(String kondisi) {
        if(kondisi.equalsIgnoreCase(BAIK.toString()))
            return AssetCondition.BAIK;
        else if(kondisi.equalsIgnoreCase(RUSAK.toString()))
            return AssetCondition.RUSAK;
        else
            return AssetCondition.BUTUH_PERBAIKAN;
    }

}