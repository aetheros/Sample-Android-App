// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.techfieldtool.utils;

import android.graphics.drawable.Drawable;

public class DeviceCommand {
    public static final int WAN_LINK = 1;
    public static final int METER_INFORMATION = 2;
    public static final int SMART_HUB = 3;

    private int commandId;
    private String label;
    private Drawable icon;

    public DeviceCommand(int commandId, String label, Drawable icon) {
        this.commandId = commandId;
        this.label = label;
        this.icon = icon;
    }

    public int getCommandId() {
        return this.commandId;
    }

    public String getLabel() {
        return this.label;
    }

    public Drawable getIconDrawable() {
        return this.icon;
    }
}

