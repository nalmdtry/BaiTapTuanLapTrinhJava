package com.example.orderprocessing;

public class Customer {
    private int tier; // Cấp độ khách hàng

    public Customer(int tier) {
        this.tier = tier;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Customer{tier=" + tier + "}";
    }
}