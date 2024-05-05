package com.conditionalsAndloops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        Fibonacci Numbers :
//        0 , 1 , 1 , 2 , 3 - the previous two number sum is the next number
//  Q. Find the nth fibonacci number.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
