package com.conditionalsAndloops;

public class CountingOccur {
    public static void main(String[] args) {
//        Q. How many times the number occured
        int n = 455536;
        int count = 0;
        while(n>0){
            int rem = n % 10;
            if (rem == 5)
            {
                count++;
            }
            n = n/10; // n /= 10
        }
        System.out.println(count);
    }
}
