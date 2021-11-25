package com.company;

import com.company.models.ClothingItem;
import com.company.models.ClothingSize;

import java.text.NumberFormat;

public class Clothes {
    public static void main(String[] args) {
        var item = new ClothingItem();
        item.setType(ClothingItem.SHIRT);
        item.setPrice(2.33);
        item.setQty(12);
        item.setSize(ClothingSize.M);

        var totalPrice = item.getPrice() * item.getQty();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format(
                "Your %s (size: %s) order will cost %s",
                item.getType(),
                item.getSize(),
                formatter.format(totalPrice)
        );
        System.out.println(output);

        var secondItem = new ClothingItem(ClothingItem.PANTS, ClothingSize.L, 3.44, 5);
        var secondOutput = String.format(
                "Your %s will be cost %s",
                secondItem.getType(),
                formatter.format(secondItem.getPrice() * secondItem.getQty()));
        System.out.println(secondOutput);
    }
}
