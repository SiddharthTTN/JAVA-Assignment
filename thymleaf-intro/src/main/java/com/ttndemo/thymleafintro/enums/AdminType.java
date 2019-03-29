package com.ttndemo.thymleafintro.enums;

public enum AdminType {
    USER("User"),
    ADMIN("Admin"),
    SUPER_ADMIN("Super_Admin");
    String value;

    AdminType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
