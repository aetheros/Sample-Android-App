// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.client;

import com.aetheros.aos.onem2m.client.cse.CSE;

/**
 * AOS Client.
 */
public class AOSClient {
    /**
     * @param host CSE server.
     * @return An instance of CSE.
     */
    public CSE getCSE(String host) {
        return new CSE(host);
    }

    /**
     * @param host CSE server.
     * @param port CSE port.
     * @return An instance of CSE.
     */
    public CSE getCSE(String host, int port) {
        return new CSE(host, port);
    }
}