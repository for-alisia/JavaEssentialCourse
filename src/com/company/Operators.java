package com.company;

public class Operators {
    public static void main(String[] args) {
        // Types of operators in Java
        // 1. Equality
        // 2. Assignment
        // 3. Logical
        // 4. Ternary

        // Mathematical
        var myInt = 10;
        var newInt1 = myInt + 5; // 15
        var newInt2 = myInt - 5; // 5
        var newInt3 = myInt * 2; // 20
        var newInt4 = myInt / 2; // 5
        // But if you need double
        double newDouble = myInt / 2.5; // 4
        var newInt5 = myInt % 5; // 0
        // Postfix
        System.out.println(myInt++); // Output 10, then value will be changed to 11
        myInt--; // 10
        // Prefix
        System.out.println(++myInt); // Output 11, value 11
        --myInt; // 10
        myInt += 5; // 15
        myInt -= 5; // 10

        // Equality
        if (newInt2 == newInt4) {
           // Do something
        }
        if (newInt1 != newInt3) {
            // Do something
        }

        // For numeric values:
        // > and >=
        // < and <=

        // For objects
        // instanceof

        // For string (not use ==)
        var str1 = "hello";
        var str2 = "hello";

        if (str1.equals(str2)) {
            // do something
        }

        // Logical Operators
        // && (AND)
        // || (OR)
        // ?= (Ternary)
        var i = 1;
        var message = (i == 1) ? "It's 1" : "it's not 1";
    }
}
