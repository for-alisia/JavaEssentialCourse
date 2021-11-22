package com.company;

import java.io.*;


public class TryCatch {
    public static void main(String[] args) {
        String s = "";
        // In java we can have multiple catch blocks (for each exception separately)
        try {
            var sub = s.substring(1);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null pointer: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Out of bounds: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("I don't know what happened " + e.getMessage());
        }

        System.out.println("App is running after exception!");

        var file = new File("hello.txt");

        System.out.println("File exists: " + file.exists());
        // example of closing to avoid memory leaks
        // put it into brackets to try block, and they will be closed automatically
        // you need to close everything that implements interface Closable (look docs)
        try (FileReader reader = new FileReader(file);
             BufferedReader bf = new BufferedReader(reader)) {
            var text = bf.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
