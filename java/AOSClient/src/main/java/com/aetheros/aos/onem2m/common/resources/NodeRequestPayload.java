// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

public class NodeRequestPayload {
   int op;
   String to;
   String rqi;

    public NodeRequestPayload(int op, String to, String rqi) {
        this.op = op;
        this.to = to;
        this.rqi = rqi;
    }

    public int getOp() {
        return this.op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getRqi() {
        return this.rqi;
    }

    public void setRqi(String rqi) {
        this.rqi = rqi;
    }

}