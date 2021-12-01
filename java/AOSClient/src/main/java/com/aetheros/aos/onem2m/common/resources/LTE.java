// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

/**
 * LTE Test Mode Resource.
 */
public class LTE extends Channel {
    private InnerClass lte;

    /**
     * Constuctor.
     * 
     * @param int mod Mode (0 = Operational. 1 = Test Mode)
     * @param int sus Status ( 0 = Idle. 1 = Receiving. 2 = Transmitting)
     * @param int actn TBD.
     * @param int chan Band.
     * @param int bw Channel bandwidth (0 = 1.4 MHz. 1 = 3.0 MHz. 2 = 5.0 MHz.).
     * @param double txPwr Transmit power (tenths of dBm).
     * @param double rxPwr Receive power (tenths of dBm 0 indicates power reading not available).
     */
    public LTE(int mod, int sus, int actn, int chan, int bw, double txPwr, double rxPwr) {
        this.lte = new InnerClass(mod, sus, actn, chan, bw, txPwr, rxPwr);
    }

    
    /** 
     * @return int The mode.
     */
    public int getMod() {
        return this.lte.mod;
    }
    
    
    /** 
     * @return int The status.
     */
    public int getSus() {
        return this.lte.sus;
    }

    
    /** 
     * @return int TBD.
     */
    public int getActn() {
        return this.lte.actn;
    }

    
    /** 
     * @return int The band.
     */
    public int getChan() {
        return this.lte.chan;
    }

    
    /** 
     * @return int The Bandwidth.
     */
    public double getBw() {
        return this.lte.bw;
    }

    
    /** 
     * @return double The transmit power in tenths of dBm.
     */
    public double getTxPwr() {
        return this.lte.txPwr;
    }

    
    /** 
     * @return double The receive power in tenths of dBm.
     */
    public double getRxPwr() {
        return this.lte.rxPwr;
    }

    /**
     * Stores the child contents.
     */
    public static class InnerClass {
       private int mod;
       private int sus;
       private int actn;
       private int chan;
       private double bw;
       private double txPwr;
       private double rxPwr;

       public InnerClass() {};

       public InnerClass(int mod, int sus, int actn, int chan, double bw, double txPwr, double rxPwr) {
            this.mod = mod;
            this.sus = sus;
            this.actn = actn;
            this.chan = chan;
            this.bw = bw;
            this.txPwr = txPwr;
            this.rxPwr = rxPwr;
       }
    }
}