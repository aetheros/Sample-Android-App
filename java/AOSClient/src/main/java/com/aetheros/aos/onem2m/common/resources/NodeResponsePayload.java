// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

/**
 * Structure class for node response serialization.
 */
public class NodeResponsePayload {
    private Node nod;

    public NodeResponsePayload(Node nod) {
        this.nod = nod;
    }

    public Node getNod() {
        return this.nod;
    }

    public void setNod(Node nod) {
        this.nod = nod;
    }
}