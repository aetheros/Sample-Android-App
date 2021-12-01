
// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.client.exceptions;

public class InvalidAcceptTypeException extends OneM2MException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InvalidAcceptTypeException(int acceptType) {
        super(String.format("%d is not supported by the server."));
    }
}