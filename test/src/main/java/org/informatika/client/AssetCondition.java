
package org.informatika.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assetCondition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="assetCondition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAIK"/>
 *     &lt;enumeration value="RUSAK"/>
 *     &lt;enumeration value="BUTUH_PERBAIKAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "assetCondition")
@XmlEnum
public enum AssetCondition {

    BAIK,
    RUSAK,
    BUTUH_PERBAIKAN;

    public String value() {
        return name();
    }

    public static AssetCondition fromValue(String v) {
        return valueOf(v);
    }

}
