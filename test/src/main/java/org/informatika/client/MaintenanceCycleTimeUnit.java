
package org.informatika.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maintenanceCycleTimeUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="maintenanceCycleTimeUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SECONDS"/>
 *     &lt;enumeration value="MINUTES"/>
 *     &lt;enumeration value="HOURS"/>
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="MONTHS"/>
 *     &lt;enumeration value="YEARS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "maintenanceCycleTimeUnit")
@XmlEnum
public enum MaintenanceCycleTimeUnit {

    SECONDS,
    MINUTES,
    HOURS,
    DAYS,
    MONTHS,
    YEARS;

    public String value() {
        return name();
    }

    public static MaintenanceCycleTimeUnit fromValue(String v) {
        return valueOf(v);
    }

}
