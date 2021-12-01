// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

/**
 * Module Info External Resource (miext).
 */
public class ExternalModuleInformation extends Child {
        private int cnstat;
        private String iccid;
        private String imei;
        private String imsi;
        private String modtm; 
        private String modtz;
        private boolean psmen;


    public ExternalModuleInformation(int cnstat, String iccid, String imei, String imsi, String modtm, String modtz, boolean psmen) {
        this.cnstat = cnstat;
        this.iccid = iccid;
        this.imei = imei;
        this.imsi = imsi;
        this.modtm = modtm;
        this.modtz = modtz;
        this.psmen = psmen;
    }

    public int getCnstat() {
        return this.cnstat;
    }

    public void setCnstat(int cnstat) {
        this.cnstat = cnstat;
    }

    public String getIccid() {
        return this.iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getImei() {
        return this.imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return this.imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getModtm() {
        return this.modtm;
    }

    public void setModtm(String modtm) {
        this.modtm = modtm;
    }

    public String getModtz() {
        return this.modtz;
    }

    public void setModtz(String modtz) {
        this.modtz = modtz;
    }

    public boolean isPsmen() {
        return this.psmen;
    }

    public boolean getPsmen() {
        return this.psmen;
    }

    public void setPsmen(boolean psmen) {
        this.psmen = psmen;
    }

}