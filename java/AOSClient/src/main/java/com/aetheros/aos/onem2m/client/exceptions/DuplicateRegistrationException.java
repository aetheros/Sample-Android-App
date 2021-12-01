// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.client.exceptions;

public class DuplicateRegistrationException extends OneM2MException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public DuplicateRegistrationException() {
        super("The AE has already been registered.");
    }
    
}