// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

/**
 * Structure class for Connectivity Monitoring External Resource
 * (cmext).
 */
public class ExternalConnectivityMonitor extends Child {
    private int rsrp;
    private int rsrq;

    public ExternalConnectivityMonitor(int rsrp, int rsrq) {
        this.rsrp = rsrp;
        this.rsrq = rsrq;
    }

    /** 
     * @return int The rsrp.
     */
    public int getRsrp() {
        return this.rsrp;
    }

    
    /** 
     * @return int The rsrq.
     */
    public int getRsrq() {
        return this.rsrq;
    }
}