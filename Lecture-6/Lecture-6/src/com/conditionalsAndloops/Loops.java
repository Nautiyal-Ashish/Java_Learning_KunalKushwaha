package com.conditionalsAndloops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        1. FOr Loop
        /*
        Syntax For LOOP
        for (initialisation ; conditon ; increment/decrement){
            //body
        }
        */
        // Q : Print numbers from 1 to 5;
//        for (int num=1;num <= 5 ; num+=1){
//            System.out.println(num);
//        }

//        print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n  ; num++) {
////            System.out.print(num+ " ");
//            System.out.println("Hello World!");
//        }

//        While loop
       /* Syntax : while (condition){
            //body
        }
        */
//        int num = 1;
//        while(num<=5){
//            System.out.println(num);
//            num = num + 1;
//        }

//        Do- While Loop
        /*
        Syntax :
        do {
        //body
        }while (condition);
         */
        //Executes the code atleast once and then check the condition

        int n = 1;
        do{
            System.out.println(n);
            n++;
        } while (n<=5);



    }
}
// When to use while , for loop
// We run while when we don't know how many times the loop is going to run
// We run for when we know how many times the loop is going to run
