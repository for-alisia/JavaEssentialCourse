package com.company;

public class Functions {
    public static void main(String[] args) {
        var myName = "Elena";
        // Static method inside class can be used without classname
        printS(myName);
        // Not static method, called on instance
        Functions myInstance = new Functions();
        myInstance.print(myName);

    }

    // Not static method - can be called on instance
    void print(String data) {
        System.out.println(data);
    }

    // Static method
    // Can be used on class itself (not on instance)
    static void printS(String data) {
        System.out.println(data);
    }
}
