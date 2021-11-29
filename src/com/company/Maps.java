package com.company;

import com.company.models.ClothingItem;
import com.company.models.ClothingSize;
import com.company.models.Hat;
import com.company.models.Shirt;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, ClothingItem> items = new HashMap<>();
        items.put("shirt", new Shirt(ClothingSize.L, 4.99, 3));
        items.put("hat", new Hat(ClothingSize.L, 7.99, 1));

        var shirt = items.get("shirt");
        System.out.println(shirt.getType());

        var keys = items.keySet();

        for (String key : keys) {
            var item = items.get(key);
            System.out.println(item.getType());
        }
    }
}
