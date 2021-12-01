// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

import java.util.ArrayList;
import java.util.List;

/**
 * OneM2M Node Resource.
 */
public class Node {
    private ChildrenContainer ch;
    private String ct;
    private String lt;
    private String ni;
    private String pi;
    private String ri;
    private String rn;
    private int ty;

    /**
     * Default constructor.
     */
    public Node() {
        this.ch = new ChildrenContainer();
    }

    /**
     * Adds a child to the Node's childrens container (ch).
     * 
     * @param child An instance of a class derived from Child.
     */
    public void addChild(Child child) {
        this.ch.addChild(child);
    }

    /**
     * A child container.
     */
    public static class ChildrenContainer extends ArrayList<Child> {
        /**
         * Adds a child to the Node's children container.
         * @param child An instance of a class derived from Child.
         */
        public void addChild(Child child) {
            this.add(child);
        }
    }

    /**
     * Get all of the node's children.
     * 
     * @return A list of the node's children.
     */
    public List<Child> getChildren() {
        return this.ch;
    }
}