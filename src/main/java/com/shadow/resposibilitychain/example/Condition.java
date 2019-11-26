package com.shadow.resposibilitychain.example;

public class Condition {
    private double upper;
    private double lower;

    Condition(double lower, double upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public boolean trigger(ApproveRequest request) {
        if (upper < lower) {
            return request.getPrice() >= lower;
        } else {
            return request.getPrice() >= lower && request.getPrice() < upper;
        }
    }
}
