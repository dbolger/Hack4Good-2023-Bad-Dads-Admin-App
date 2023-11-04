package com.baddads.entities.usermanagement.user.attributes;

public enum MartialStatus {
    MARRIED("Married"),
    ENGAGED("Engaged"),
    SINGLE("Single"),
    WIDOWED("Widowed");
    private String friendlyName;

    MartialStatus(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getFriendlyName() {
        return friendlyName;
    }
}
