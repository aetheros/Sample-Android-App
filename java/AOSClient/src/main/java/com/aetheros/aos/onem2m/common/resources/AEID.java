// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

/**
 * Application Entity ID.
 */
public class AEID {
    private String id;

    /**
     * Default constructor.
     */
    public AEID() {}

    /**
     * Constructor I.
     */
    public AEID(String id) {
        this.id = id;
    }

    /**
     * @return String The application id.
     */
    public String toString() {
        return this.id;
    }
}