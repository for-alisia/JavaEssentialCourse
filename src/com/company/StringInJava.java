package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

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
        System.out.println("String length: " + s1.length()); // 12
        var position = s1.indexOf("ing");
        System.out.println("Position: " + position); // 9
        var substr = s1.substring(3, 8);
        System.out.println("Substring: " + substr); // st st
        var manySpaces = "Hi      ";
        var trimmed = manySpaces.trim(); // "Hi"

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

        // Comparing strings
        String strToCampare1 = "Hello";
        String strToCompare2 = new String("Hello");

        // Bad way of comparing
        if (strToCampare1 == strToCompare2) {
            System.out.println("Strings match");
        } else {
            System.out.println("They don't match"); // Don't match
        }

        if (strToCampare1.equals(strToCompare2)) { // use equalsIgnoreCase() if you need to ignore case
            System.out.println("Strings match"); // They match
        } else {
            System.out.println("They don't match");
        }

        // But for strings created without new operator first approach can work
        // Java inside on creating string checks if the same string is already exists
        // And if it's a case, then give a reference to that object to a new variable

        // Strings from user input
        var scanner = new Scanner(System.in);
        System.out.print("Enter a value: "); // print (not println) keep cursor on the same line
        var input = scanner.nextLine();
        System.out.println(input);

        System.out.print("Enter a number: ");
        var inputNumber = scanner.nextInt(); // It will be converted to an int
        System.out.println(inputNumber);
    }
}
