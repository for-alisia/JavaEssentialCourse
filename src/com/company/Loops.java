package com.company;

public class Loops {
    public static void main(String[] args) {
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        // Classic for loop
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + " is " + i + " month");
        }

        // Enhanced foreach loop
        for (String month : months) {
            System.out.println(month);
        }

        // while loop
        var whileCounter = 0;

        while(whileCounter < months.length) {
            System.out.println(months[whileCounter] + " while");
            whileCounter++;
        }

        // do while loop
        var doCounter = 0;

         do {
            System.out.println(months[doCounter] + " do while");
            doCounter++;
        } while(doCounter < months.length);
    }
}
