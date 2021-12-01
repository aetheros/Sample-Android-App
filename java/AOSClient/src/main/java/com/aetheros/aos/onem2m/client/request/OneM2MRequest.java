// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.client.request;

import com.aetheros.aos.onem2m.common.options.OneM2MOptionSet;

import org.eclipse.californium.core.coap.Request;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.coap.CoAP.Code;
import org.eclipse.californium.core.coap.CoAP.Type;

/**
 * OneM2MRequest enforce OneM2M specific constraints and logic.
 */
public class OneM2MRequest extends Request {
    private int version = 1;
    private int contentType;

    private OneM2MOptionSet options;

    public OneM2MRequest(Code code) {
        super(code);
    }

    /**
     * @param code Request code.
     * @param type Request type.
     */
    public OneM2MRequest(Code code, Type type) {
        super(code, type);
    }
    
    /** 
     * Enforce valid content types here.
     * 
     * @param contentType Content type.
     */
    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    
    /** 
     * Enforce valid options and set default options here.
     * 
     * @param options 
     * @return Message 
     */
    public Message setOptions(OneM2MOptionSet options) {
        super.setOptions(options.getOptionSet());
        this.options = options;
		return this;
    }
}
