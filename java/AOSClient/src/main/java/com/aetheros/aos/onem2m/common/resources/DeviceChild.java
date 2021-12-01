// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

/**
 * Structure class for device object.
 */
public class DeviceChild extends Child {
    private DeviceInformation dvi;
    private ExternalModuleInformation miext;

    
    /** 
     * Constructor I.
     * 
     * @param dvi Device Information.
     */
    public void addDeviceInformation(DeviceInformation dvi) {
        this.dvi = dvi;
    }

    
    /** 
     * Constructor II.
     * 
     * @param miext External Module Infomartion.
     */
    public void addExternalModuleInformation(ExternalModuleInformation miext) {
        this.miext = miext;
    }

    /** 
     * Constructor III.
     * 
     * @param dvi Device Information.
     * @param miext External Module Infomartion.
     */
    public DeviceChild(DeviceInformation dvi, ExternalModuleInformation miext) {
        this.dvi = dvi;
        this.miext = miext;
    }

    
    /** 
     * @return DeviceInformation
     */
    public DeviceInformation getDvi() {
        return this.dvi;
    }

    
    /** 
     * @return ExternalModuleInformation
     */
    public ExternalModuleInformation getMiext() {
        return this.miext;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " dvi='" + getDvi() + "'" +
            ", miext='" + getMiext() + "'" +
            "}";
    }
    
}