package com.function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum(); // calling a function
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20 , 30);
        System.out.println(ans);
    }

    // Pass the value of numbers when you are calling the method in main()

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

// return the value
//    static int sum2(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Number 1 :");
//        int num1 = in.nextInt();
//        System.out.println("Enter Number 2 :");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return  sum;
//    }

//    Making a function
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Number 1 :");
//        int num1 = in.nextInt();
//        System.out.println("Enter Number 2 :");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum is eqaul to " + sum);
//    }



/*
    access modifier return_type name (arguments) {
      //body
      return statement;
    }
* */
}
