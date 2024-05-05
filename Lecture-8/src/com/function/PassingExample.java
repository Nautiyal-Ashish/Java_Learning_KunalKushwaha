package com.function;

public class PassingExample {
    public static void main(String[] args) {
        String name  = "Ashish Nautiyal";
        greet(name);
    }

     static void greet(String anotherName) {
         System.out.println(anotherName);
    }
}

