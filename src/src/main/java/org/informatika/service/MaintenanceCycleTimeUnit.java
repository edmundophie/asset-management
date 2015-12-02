package org.informatika.service;

import sun.applet.Main;

/**
 * Created by edmundophie on 12/1/15.
 */
public enum MaintenanceCycleTimeUnit {
    SECONDS("seconds"),
    MINUTES("minutes"),
    HOURS("hours"),
    DAYS("days"),
    MONTHS("months"),
    YEARS("years");


    private final String cycle;

    private MaintenanceCycleTimeUnit(String cycle) {
        this.cycle = cycle;
    }

    public String getCycle() {
        return this.cycle;
    }

    public static MaintenanceCycleTimeUnit getInstance(String cycle) {
        if (cycle.equalsIgnoreCase(SECONDS.toString()))
            return MaintenanceCycleTimeUnit.SECONDS;
        else if (cycle.equalsIgnoreCase(MINUTES.toString()))
            return MaintenanceCycleTimeUnit.MINUTES;
        if (cycle.equalsIgnoreCase(HOURS.toString()))
            return MaintenanceCycleTimeUnit.HOURS;
        if (cycle.equalsIgnoreCase(DAYS.toString()))
            return MaintenanceCycleTimeUnit.DAYS;
        if (cycle.equalsIgnoreCase(MONTHS.toString()))
            return MaintenanceCycleTimeUnit.MONTHS;
        else
            return MaintenanceCycleTimeUnit.YEARS;
    }

    public long toMillis(long c) {
        if(this.cycle.equalsIgnoreCase(SECONDS.toString()))
            return c*1000;
        else if(this.cycle.equalsIgnoreCase(MINUTES.toString()))
            return c*1000*60;
        else if(this.cycle.equalsIgnoreCase(HOURS.toString()))
            return c*1000*60*60;
        else if(this.cycle.equalsIgnoreCase(DAYS.toString()))
            return c*1000*60*60*24;
        else if(this.cycle.equalsIgnoreCase(MONTHS.toString()))
            return c*1000*60*60*24*30;
        else
            return c*1000*60*60*24*365;
    }
}