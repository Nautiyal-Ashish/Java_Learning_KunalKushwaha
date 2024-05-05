package com.function;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        // Q : Take an input of two numbers and print the sum
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is eqaul to " + sum);


    }
}
