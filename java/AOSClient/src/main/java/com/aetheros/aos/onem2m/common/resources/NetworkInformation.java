// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

import java.util.Objects;

/**
 * Wrapper class for network information object.
 */
public class NetworkInformation extends Child {
    private ACPEXT acpext;
    private TSTMD tstmd;

    /**
     * Constructor.
     * 
     * @param acpext TBD.
     * @param tstmd Test Mode Resource.
     */
    public NetworkInformation(ACPEXT acpext, TSTMD tstmd) {
        this.acpext = acpext;
        this.tstmd = tstmd;
    }
    
    /** 
     * @return ACPEXT
     */
    public ACPEXT getAcpext() {
        return this.acpext;
    }

    
    /** 
     * @return TSTMD The Test Mode Resource.
     */
    public TSTMD getTstmd() {
        return this.tstmd;
    }

    /** 
     * Compares to another instance. 
     * 
     * @param o An object to compare against.
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NetworkInformation)) {
            return false;
        }
        NetworkInformation networkInformation = (NetworkInformation) o;
        return Objects.equals(acpext, networkInformation.acpext) && Objects.equals(tstmd, networkInformation.tstmd);
    }
    
    /** 
     * @return String The string representation of the instance.
     */
    @Override
    public String toString() {
        return "{" +
            " acpext='" + getAcpext() + "'" +
            ", tstmd='" + getTstmd() + "'" +
            "}";
    }

}
