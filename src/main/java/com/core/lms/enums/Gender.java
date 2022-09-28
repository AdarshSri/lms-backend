package com.core.lms.enums;

public enum Gender {
    Male("M"), Female("F"), Other("O");

    public final String label;

    private Gender(String label) {
        this.label = label;
    }
}
