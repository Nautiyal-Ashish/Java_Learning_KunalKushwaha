package com.function;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//    swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a + " " + b);

        swap(2,3);
        System.out.println(a + " " + b);

        String name = "Ashish Nautiyal";
        changeName(name);

    }

    static void changeName(String name) {
        name = "Kunal";
    }

    //    Using Function
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
