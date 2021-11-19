package com.company;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var d1 = getInput(scanner, "First number: ");

        var d2 = getInput(scanner, "Second number: ");

        double result = addValues(d1, d2);

        System.out.println(result);

        double triple = addValues(d1, d2, 10);

        System.out.println(triple);

        double multiple = addValues(d1, d2, 10, 2, 13);

        System.out.println(multiple);
    }
    // In java arguments always passes as copies!
    // But with objects it will be a copy of reference, so original will be changed
    // But strings are immutable, so they behaves as primitives

    private static double getInput(Scanner scanner, String propmt) {
        System.out.print(propmt);
        return scanner.nextDouble();
    }

    private static double addValues(double val1, double val2) {
        return val1 + val2;
    }

    // In java methods can have the same names
    private static double addValues(double val1, double val2, double val3) {
        return val1 + val2 + val3;
    }

    // Method with any number of arguments
    private static double addValues(double... values) {
        double sum = 0;
        for (var value : values) {
            sum += value;
        }

        return sum;
    }
}
