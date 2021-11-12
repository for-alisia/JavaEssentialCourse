package com.company;

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
        // Strings are immutable!!!

        // Useful methods
        var upper = s4.toUpperCase();
        var charAt = s4.charAt(1); // h
        var bytes = s4.getBytes();

        // Working with builders
        var sb = new StringBuilder("Welcome");

    }
}
