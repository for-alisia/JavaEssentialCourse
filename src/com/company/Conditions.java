package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        // If - Else condition
        var scanner = new Scanner(System.in);
        System.out.println("Provide a number of the current month:");
        var monthInput = scanner.nextInt();

        var now = LocalDateTime.now();
        var monthNumber = now.getMonth();

        switch (monthInput) {
            case 1:
            case 2:
            case 12:
                System.out.println("It's a winter now");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's a spring now");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's a summer now");
                break;
            default:
                System.out.println("It's a fall now");
        }

        String message; // In Java we have block scope
        if (monthInput < 1 || monthInput > 12) {
            System.out.println("You live on another planet");
        } else if(monthNumber.getValue() == monthInput) {
            System.out.println("You are correct");
        } else {
            System.out.println("Look at the calendar");
        }
    }
}
