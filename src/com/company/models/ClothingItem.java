package com.company.models;

public class ClothingItem {
    // In java there is no special declaration for const
    // But we can use this syntax
    public static final String SHIRT = "Shirt";
    public static final String PANTS = "Pants";
    public static final String SHOES = "Shoes";

    // Not constants
    private String type;
    private ClothingSize size;
    private double price;
    private int qty;

    // In java we can have multiple constructors
    // Name of the constructor should match the class name
    // Constructor does not have returning value
    public ClothingItem() {
    }

    public ClothingItem(String type, ClothingSize size, double price, int qty) {
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

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
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
