package com.shadow.resposibilitychain.example;

import java.util.UUID;

/**
 * 请求对象
 */
public class ApproveRequest {
    private String id;
    private double price;

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public ApproveRequest(double price) {
        this.id = UUID.randomUUID().toString();
        this.price = price;
    }
}
