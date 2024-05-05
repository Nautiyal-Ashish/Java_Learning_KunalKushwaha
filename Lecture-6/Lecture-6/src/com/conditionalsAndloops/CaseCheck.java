package com.conditionalsAndloops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
//        Q. Check wheather input character is lower or upper case
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
    }
}

//trim() - removes the extra space
//charAt() - character at index of string