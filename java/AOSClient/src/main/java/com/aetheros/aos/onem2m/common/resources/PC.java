// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

/**
 * Structure class for payload container serialization.
 */
public class PC {
    AE ae;
    Node nod;

    /**
     * Default constructor.
     */
    public PC() {}

    /**
     * Constructor II
     * 
     * @param ae An instance of AE.
     */
    public PC(AE ae) {
        this.ae = ae;
    }

    /**
     * Constructor II
     * 
     * @param nod An instance of node.
     */
    public PC(Node node) {
        this.nod= node;
    }

    /**
     * Constructor III
     * 
     * @param ae An instance of AE.
     * @param nod An instance of node.
     */
    public PC(AE ae, Node nod) {
        this.ae = ae;
        this.nod = nod;
    }
    
    /** 
     * @return Node The node resource.
     */
    public Node getNod() {
        return this.nod;
    }
    
    /** 
     * @return AE The application entity.
     */
    public AE getAe() {
        return this.ae;
    }

    
    /** 
     * @param ae The application entity.
     */
    public void setAe(AE ae) {
        this.ae = ae;
    }

    /** 
     * @return String The string representation of the instance.
     */
    @Override
    public String toString() {
        if(this.ae != null) {
            return "{" +
                " ae='" + getAe() + "'" +
                "}";
        } else if(this.nod != null) {
            return "{" +
                " ae='" + getNod() + "'" +
                "}";
        } else {
            return "{}";
        }
    }
}