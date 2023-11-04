package com.baddads.entities.usermanagement;

public enum Ethnicity {
    AMERICAN_INDIAN_OR_ALASKA_NATIVE("American Indian or Alaska Native"),
    WHITE("White"),
    HISPANIC_OR_LATINO("Hispanic or Latino"),
    ASIAN("Asian"),
    BLACK_OR_AFRICAN_AMERICAN("Black or African American"),
    NATIVE_HAWAIIAN_OR_ISLANDER("Native Hawaiian or Islander");
    private final String friendlyName;
    Ethnicity(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getFriendlyName() {
        return friendlyName;
    }
}
