package com.company.models;

public class Shirt extends ClothingItem {
    public Shirt(ClothingSize size, double price, int qty) {
        super(ClothingItem.SHIRT, size, price, qty);
    }
}
