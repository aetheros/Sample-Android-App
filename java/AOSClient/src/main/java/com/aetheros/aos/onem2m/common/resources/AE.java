// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

/**
 * Application Entity.
 */
public class AE {
    private String[] aa;

    private String aei;
    private String api; // application id
    private String apn; // application name
    private String[] poa; // point of attachment
    private String[] at;

    private String ct;
    private String lt;
    private String pi;
    private String ri;
    private String rn;
    private String ty;

    public String[] getAa() {
        return this.aa;
    }

    public String getAei() {
        return this.aei;
    }

    public String[] getAt() {
        return this.at;
    }

    public String getCt() {
        return this.ct;
    }

    public String getLt() {
        return this.lt;
    }

    public String getPi() {
        return this.pi;
    }

    public String getRi() {
        return this.ri;
    }

    public String getRn() {
        return this.rn;
    }

    public String getTy() {
        return this.ty;
    }

    /**
     * Default constructor.
     */
    public AE() {}

    /**
     * Constructor I.
     * @param api Application ID.
     * @param apn Application name.
     * @param poa  Point of attachment.
     */
    public AE(String api, String apn, String[] poa) {
        this.api = api;
        this.apn = apn;
        this.poa =  poa;
    }

    
    /** 
     * @return String The application ID.
     */
    public String getApi() {
        return this.api;
    }

    
    /** 
     * @param api The application ID.
     */
    public void setApi(String api) {
        this.api = api;
    }

    
    /** 
     * @return String The application name.
     */
    public String getApn() {
        return this.apn;
    }

    
    /** 
     * @param apn  The application name.
     */
    public void setApn(String apn) {
        this.apn = apn;
    }

    
    /** 
     * @return String[] Points of access.
     */
    public String[] getPoa() {
        return this.poa;
    }

    
    /** 
     * @param poa Points of access.
     */
    public void setPoa(String[] poa) {
        this.poa = poa;
    }

	public void setRn(String rn) {
        this.rn = rn;
    }

	public void setAei(String aei) {
        this.aei = aei;
    }

    @Override
    public String toString() {
        return "{" +
            " aa='" + getAa() + "'" +
            ", aei='" + getAei() + "'" +
            ", api='" + getApi() + "'" +
            ", apn='" + getApn() + "'" +
            ", poa='" + getPoa() + "'" +
            ", at='" + getAt() + "'" +
            ", ct='" + getCt() + "'" +
            ", lt='" + getLt() + "'" +
            ", pi='" + getPi() + "'" +
            ", ri='" + getRi() + "'" +
            ", rn='" + getRn() + "'" +
            ", ty='" + getTy() + "'" +
            "}";
    }
}