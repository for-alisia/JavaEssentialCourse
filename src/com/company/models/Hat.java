package com.company.models;

public class Hat extends ClothingItem {
    public Hat(ClothingSize size, double price, int qty) {
        super(ClothingItem.HAT, size, price, qty);
    }
}
