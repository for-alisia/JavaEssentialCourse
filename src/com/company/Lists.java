package com.company;

import com.company.models.ClothingItem;
import com.company.models.ClothingSize;
import com.company.models.Hat;
import com.company.models.Shirt;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        };

        List<ClothingItem> items = new ArrayList<>();
        items.add(new Shirt(ClothingSize.L, 2.99, 3));
        items.add(new Hat(ClothingSize.S, 4.99, 2));

        for (ClothingItem item : items) {
            System.out.println(item.getType());
        }
    }
}
