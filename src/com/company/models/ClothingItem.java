package com.company.models;

public class ClothingItem {
    private String type;
    private String size;
    private double price;
    private int qty;

    // In java we can have multiple constructors
    // Name of the constructor should match the class name
    // Constructor does not have returning value
    public ClothingItem() {
    }

    public ClothingItem(String type, String size, double price, int qty) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.qty = qty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
