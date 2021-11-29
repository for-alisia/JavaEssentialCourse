package com.company;

import com.company.models.ClothingItem;
import com.company.models.ClothingSize;
import com.company.models.Hat;
import com.company.models.Shirt;

public class Arrays {
    public static void main(String[] args) {
        // declare array (not resizable)
        String[] colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";

        // Loop through array
        for (String color : colors) {
            System.out.println(color);
        };

        // With objects (not resizable)
        ClothingItem[] items = {
                new Hat(ClothingSize.M, 12.23, 1),
                new Shirt(ClothingSize.L, 6.99, 2),
        };
        for (ClothingItem item : items) {
            System.out.println(item.getType());
        }
    }
}
