// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.mediatypes;

public class MediaTypes {
    public static final int APPLICATION_JSON = 50;

    public static boolean isSupportMediaType(int typeId) {
        switch(typeId) {
            case APPLICATION_JSON:
                return true;
            default:
                return false;
        }
    }
}

