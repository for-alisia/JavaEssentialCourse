package com.company;

import com.company.utilities.CalcHelper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        try {
            number1 = getNumber(scanner, "Provide first number");
            number2 = getNumber(scanner, "Provide second number");
            System.out.println("Choose an operation (+, -, *, /)");
            var operation = scanner.next();
            System.out.println(calculate(number1, number2, operation));
        } catch (InputMismatchException e) {
            System.out.println("You need to provide a number");
        }
    }

    public static double calculate(double number1, double number2, String operation) {
        switch(operation) {
            case "+":
                return CalcHelper.add(number1, number2);
            case "-":
                return CalcHelper.subtract(number1, number2);
            case "*":
                return CalcHelper.multiply(number1, number2);
            case "/":
                return CalcHelper.divide(number1, number2);
            default:
                System.out.println("Not valid operation!");
                return 0;
        }
    }

    public static double getNumber(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.nextDouble();
    }


}
