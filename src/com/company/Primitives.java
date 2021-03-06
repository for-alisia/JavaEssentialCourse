package com.company;

import java.math.BigDecimal;

public class Primitives {
    public static void main(String[] args) {
        // Primitive types (saves in the fastest memory) - there names in lowe case
        // Classic way to assign variables
        boolean isTrue = true;

        // Here the value is the same, but amount of memory is different
        // Byte is the smallest, int is the largest
        byte byteVar = 1;
        short numberShort = 1;
        int numberInt = 1;

        char letter = 'c';
        double numberDouble = 2.34;
        float numberFloat = 2.43f;
        long numberLong = 123L;
        // We can separate divisions:
        long anotherLong = 3_000_000_000L;
        // Modern way to assign variable (from Java 10) - type inference
        // Works only on local variables within methods
        var modernNumber = 12;
        var hasError = false;
        // types can be set in numeric literals with alpha notation
        var newInt = 5; // integer
        var newFloat = 5f; //float
        var newDouble = 5d; // double
        var newLong = 5L; // long

        // Wrapper classes for primitives (example)
        // For all primitives Wrapper classes starts with capitalized letter
        // Exceptions: Character for char, Integer for int

        // Without wrapper
        String doubleValue = "2.54";
        double doubleObj = Double.parseDouble(doubleValue);
        var byteValue = (byte) doubleObj;
        var intValue = (int) doubleObj;
        var floatValue = (float) doubleObj;
        var stringValue = Double.toString(doubleObj);

        // With wrapper
        Double doubleObj1 = Double.parseDouble(doubleValue);
        var byteValue1 = doubleObj1.byteValue();
        var intValue1 = doubleObj1.intValue();
        var floatValue1 = doubleObj1.floatValue();
        var stringValue1 = doubleObj1.toString();

        // Each type (byte, int, short, long, float and double) has Max value and Min value
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        // All primitive values are signed
        // Long and integer support unsigned operations
        // Example
        var unsigned = Integer.parseUnsignedInt("3000000000");
        System.out.println(unsigned);
        var result = Integer.divideUnsigned(unsigned, 2);
        System.out.println(result);

        // How to work with currency (in Java we have the same problem as in JS)
        double price = 1.33;
        var stringPrice = Double.toString(price);
        var bigPrice = new BigDecimal(stringPrice);
        var checkOut = bigPrice.add(bigPrice);
        var doubleSum = checkOut.doubleValue();

        System.out.println(doubleSum);

        // Converting numeric types
        short convShort = 100;
        int convInt= convShort;  // 100
        long convLong = convInt; // 100
        // Only expanding type is allowed (from less memory usage to more memory usage)
        // short someShort = convLong;  Error here!
        // To do this special syntax can be used
        short conVSpShort = (short) convLong;

        // Booleans
        boolean bool;  // It will be "false" in this case (not initialized)
        bool = true;
        boolean bool2 = !bool;

        var i = 0;
        var bool3 = (i != 0);

        var strToBool = "true";
        var bool4 = Boolean.parseBoolean(strToBool);

        // Chars
        char someChar = 'l';
        // Can be created from unicodes
        char charFromUnicode = '\u0024'; // It's a $ sign
        // Transform to uppercase
        char upperChar = Character.toUpperCase(someChar); // 'L'
        // Creation of an array of characters
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        // Create string from array
        String stringFromChars = new String(chars);
        // Back operation
        var charArrayFromString = stringFromChars.toCharArray();
    }
}
