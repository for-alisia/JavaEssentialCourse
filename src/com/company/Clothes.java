package com.company;

import com.company.models.ClothingItem;
import com.company.models.ClothingSize;
import com.company.models.Hat;
import com.company.models.Shirt;

import java.text.NumberFormat;

public class Clothes {
    public static void main(String[] args) {

        // From super class with first constructor
        var shoes = new ClothingItem();
        shoes.setType(ClothingItem.SHOES);
        shoes.setPrice(2.33);
        shoes.setQty(12);
        shoes.setSize(ClothingSize.M);

        showInfo(shoes);

        // From superclass with second constructor
        var pants = new ClothingItem(ClothingItem.PANTS, ClothingSize.L, 3.44, 5);

        showInfo(pants);

        // From child class
        var shirt = new Shirt(ClothingSize.L, 4.55, 10);

        showInfo(shirt);

        var hat = new Hat(ClothingSize.S, 10.99, 2);

        showInfo(hat);
    }

    private static void showInfo(ClothingItem secondItem) {
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format(
                "Your %s will be cost %s",
                secondItem.getType(),
                formatter.format(secondItem.getPrice() * secondItem.getQty()));
        System.out.println(output);
    }
}
