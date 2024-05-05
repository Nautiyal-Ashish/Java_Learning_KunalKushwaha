package com.conditionalsAndloops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        Q. Find the largest of 3 numbers
//        1st Approach
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

        // 2nd Approach
//        int max = 0;
//        if (a > b) {
//            max = b;
//        }else {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

        // 3rd Approach
        int max  = Math.max(c , Math.max(a,b));
        System.out.println(max);
    }
}
