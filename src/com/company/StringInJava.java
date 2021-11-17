package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class StringInJava {
    public static void main(String[] args) {
        // Declare a string
        String s1 = "First string"; // only double quotes!
        var s2 = "Second string";
        var s3 = new String("Third string");

        // Get an array of chars
        var chars = s1.toCharArray();

        // Concatenation
        var s4 = s3 + "!"; // "Third string!"
        s4 += "!"; // "Third string!!"
        var s5 = 10 + " things"; // Will be a string (you should have at least 1 string)
        // Strings are immutable!!!

        // Converting to string
        int integerVal = 10;
        var fromIntVal = Integer.toString(integerVal);

        boolean booleanVal = true;
        var fromBoolean = Boolean.toString(booleanVal);

        long longValue = 1_000_000;
        var fromLong = Long.toString(longValue);

        // Working with Formatters (useful features to format number values as strings)
        double doubleValue = 1_000_000.53;
        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue)); // Number: 1 000 000.53

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intF.format(doubleValue)); // Number: 1 000 001
        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue)); // Number: 1000001

        // Locales
        var locale = Locale.getDefault();
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localeFormatter.format(doubleValue)); // Number: 1 000 000.53

        var anLocale = new Locale("de", "DE");
        var anLocaleFormatter = NumberFormat.getNumberInstance(anLocale);
        System.out.println("Number: " + anLocaleFormatter.format(doubleValue)); // Number: 1.000.000,53

        // Currencies
        var currency = NumberFormat.getCurrencyInstance(anLocale);
        System.out.println("Number: " + currency.format(doubleValue)); // Number: 1.000.000,53 euro sign

        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(1)); // $01.00

        // Useful methods
        var upper = s4.toUpperCase();
        var charAt = s4.charAt(1); // h
        var bytes = s4.getBytes();

        // Working with builders
        var sb = new StringBuilder("Welcome");
        sb.append(" to Poland").append("!");
        var stringFromSb = sb.toString();

        // String interpolation
        var item = "Shirt";
        var price = 4.99;
        var size = "M";
        var color = "red";

        var template = "Clothing item: %s, size: %s, color: %s, price: $%.2f";
        var itemString = String.format(template, item, size, color, price);
        System.out.println(itemString); // Clothing item: Shirt, size: M, color: red, price: $4,99

    }
}
