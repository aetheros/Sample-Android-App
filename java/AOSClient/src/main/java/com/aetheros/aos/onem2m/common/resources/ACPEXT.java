// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

/**
 * Structure class for acpext.
 */
public class ACPEXT extends Child {
    private String capn;

    public ACPEXT(String capn) {
        this.capn = capn;
    }

    public String getCapn() {
        return this.capn;
    }

    public void setCapn(String capn) {
        this.capn = capn;
    }

}