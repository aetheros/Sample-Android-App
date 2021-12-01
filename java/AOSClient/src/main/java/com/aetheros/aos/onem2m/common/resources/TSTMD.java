// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

import java.util.List;

/**
 * Test Mode Resource.
 */
public class TSTMD {
    private InnerClass tstmd;

    /**
     * Default constructor.
     */
    public TSTMD() {}
    
    /**
     * Constructor I.
     * 
     * @param channels The channels.
     */ 
    public TSTMD(List<Channel> channels) {
        this.tstmd = new InnerClass(channels);
    }

    /**
     * 
     * @return The channels.
     */
    public List<Channel> getChannels() {
        return this.tstmd.ch;
    }

    private static class InnerClass {
        private List<Channel> ch;

        public InnerClass(List<Channel> channels) {
            this.ch = channels;
        }
    }
}