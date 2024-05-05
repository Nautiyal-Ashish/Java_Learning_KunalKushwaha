package com.ashish;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
////      Float is greater than int
//        System.out.println(num);

//Left hand side should be always greater
// We gave int and it outputs in float this conversion is called type conversion.
//It is dependent on the value that it will convert or not.
//In float we can give int value but not the string.

//---------------------------------------------------
// How to convert a greater value in smaller value . This is called narower conversion
//        int num = (int)(68.55f);
//        System.out.println(num);
//---------------------------------------------------
// Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);
// Prints 1 because the byte only stores upto 256 and we gave the value
// This will give the remainder to us as 257 % 256 -> 1
//----------------------------------------------------
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b /c;
//        System.out.println(d);
//        In expression it automatically convert the byte value to int .
//        It means that a*b is converted to int
//----------------------------------------------------
//        byte b = 50;
//        b  = b * 2;// In this we cant convert it
//-----------------------------------------------------
//        int number = 'A';
//        System.out.println(number);
//    Giving the ouput 65 because it is converting the int to characters ASCII value
//----------------------------------------------------
//        Unicode value can be printed
        System.out.println("合十礼");
    }
}



