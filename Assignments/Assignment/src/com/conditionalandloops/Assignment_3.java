package com.conditionalandloops;

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
// Q1 - Area Of Circle Java Program ✅
// Area of circle = 22/7 (pie) * radius * radius
//        System.out.print("Enter the radius : ");
//        Scanner in = new Scanner(System.in);
//        float r = in.nextFloat();
//        double pi = 3.14;
//        double area = pi * r * r;
//        System.out.println("Area of Circle : "+ area);
//    }

// Q2 - Area Of Triangle ✅
// Area of Triangle = 1/2 * b * h
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Breadth : ");
//        float b = in.nextFloat();
//        System.out.print("Enter the Height : ");
//        float h = in.nextFloat();
//        double triangleArea = 0.5 * b * h;
//        System.out.println(triangleArea);

// Q3 - Area Of Rectangle Program ✅
// Area of rectangle = l * b;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Length : ");
//        int l = in.nextInt();
//        System.out.print("Enter the breadth : ");
//        int b = in.nextInt();
//        int rectangleArea =  l * b;
//        System.out.println(rectangleArea);

// Q4 - Area Of Isosceles Triangle ✅
// Area Of Isosceles Triangle = 0.5 * b * h
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Breadth : ");
//        float b = in.nextFloat();
//        System.out.print("Enter the Height : ");
//        float h = in.nextFloat();
//        double IsoscelesArea = 0.5 * b * h;
//        System.out.println(IsoscelesArea);


// Q5 -  Area Of Parallalogram = b * h ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the breadth : ");
//        float b = in.nextFloat();
//        System.out.print("Enter the height : ");
//        float h = in.nextFloat();
//        double parallalogramArea =  b * h;
//        System.out.println(parallalogramArea);


// Q6 - Area Of Rhombus = diagonal1 * diagonal2 / 2 ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Diagonal 1 value : ");
//        int d1 = in.nextInt();
//        System.out.print("Enter the Diagonal 2 Value : ");
//        int d2 = in.nextInt();
//        int rhombusArea =  d1 * d2 / 2;
//        System.out.println(rhombusArea);

// Q7 - Area Of Equilateral Triangle = √3/4 * a * a ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Length of sides : ");
//        float a = in.nextFloat();
//        double equilateralArea = Math.sqrt(3)/4*a*a;
//        System.out.println(equilateralArea);

// Q8 - Perimeter Of Circle = 2 * 3.14 * radius ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the radius : ");
//        float r = in.nextFloat();
//        double perimeterCircle =  2 * 3.14 * r;
//        System.out.println(perimeterCircle);

// Q9 - Perimeter Of Equilateral Triangle ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the side length : ");
//        float a = in.nextFloat();
//        double perimeterEquilateralTriangle =  3 * a;
//        System.out.println(perimeterEquilateralTriangle);

// Q10 - Perimeter Of Parallelogram ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the value of Side 1 : ");
//        float a = in.nextFloat();
//        System.out.print("Enter the value of Side 1 : ");
//        float b = in.nextFloat();
//        double perimeterParallaelogram =  2 * (a+b) ;
//        System.out.println(perimeterParallaelogram);

// Q11 - Perimeter Of Rectangle ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the length : ");
//        float l = in.nextFloat();
//        System.out.print("Enter the breadth : ");
//        float b = in.nextFloat();
//        double perimeterRectangle =  2 * (l+b) ;
//        System.out.println(perimeterRectangle);

// Q12 - Perimeter Of Square ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Side : ");
//        float side = in.nextFloat();
//        double perimeterSquare = 4 * side;
//        System.out.println(perimeterSquare);

//Q13 - Perimeter Of Rhombus ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Side : ");
//        float side = in.nextFloat();
//        double perimeterRhombus = 4 * side;
//        System.out.println(perimeterRhombus);

// Q14 - Volume Of Cone ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Base radius of the cone : ");
//        float r = in.nextFloat();
//        System.out.print("Enter the height of the cone : ");
//        float h = in.nextFloat();
//        double volumeCone =  3.14 * (r * r) * h / 3 ;
//        System.out.println(volumeCone);

// Q15 - Volume Of Prism ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the height : ");
//        float h = in.nextFloat();
//        System.out.print("Enter the base : ");
//        float b = in.nextFloat();
//        double volumePrism = h * b;
//        System.out.println(volumePrism);

// Q16 - Volume of Cylinder ✅
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Base radius : ");
//        float r = in.nextFloat();
//        System.out.print("Enter the height : ");
//        float h = in.nextFloat();
//        double volumeCylinder =  3.14 * (r * r) * h;
//        System.out.println(volumeCylinder);

// Q17 - Volume Of Sphere  ✅
//        System.out.println("Volume Of Sphere");
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the radius : ");
//        float r = in.nextInt();
//        double volumeSphere =  4 * 3.14 * (r*r*r)/3;
//        System.out.println(volumeSphere);

// Q18 - Volume Of Pyramid ✅
//        System.out.println("Volume of Pyramid");
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the length : ");
//        float l = in.nextInt();
//        System.out.print("Enter the width : ");
//        float w = in.nextInt();
//        System.out.print("Enter the height : ");
//        float h = in.nextInt();
//        double volumePyramid =  ( l * w * h ) / 3;
//        System.out.println(volumePyramid);

// Q19 - Curved Surface Area Of Cylinder✅
//        System.out.println("Curved Surface Area Of Cylinder");
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the radius : ");
//        float r = in.nextInt();
//        System.out.print("Enter the height : ");
//        float h = in.nextInt();
//        double csaCylinder =  2 * 3.14 * r * h;
//        System.out.println(csaCylinder);

// Q20 - Total Surface Area Of Cube✅
//        System.out.println("Surface area of Cube");
//        Scanner in = new Scanner(System.in);
//        float a = in.nextFloat();
//        double TSACube = 6 * (a*a);
//        System.out.println(TSACube);

// Q21 - Fibonacci Series In Java Programs (Important) ✅
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0, s = 1, th = 0;

        System.out.print(f+" "+s+" ");
        for(int i=1; i<=n-2; i++) {
            th = f+s;
            System.out.print(th+" ");
            f = s;
            s = th;
        }

// Q22 - Subtract the Product and Sum of Digits of an Integer ❌
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a Integer : ");
//        int n = in.nextInt();
//        int sum = 0;
//        int product = 0;
//        if (n > 0) {
//            sum = sum + n % 10;
//        }
//        System.out.println(sum);

// Q23 - Input a number and print all the factors of that number (use loops). ‼️
//        Scanner in  = new Scanner(System.in);
//        System.out.print("Enter a Number : ");
//        int number = in.nextInt();
//        int i = 1 ;
//        while (i <= number) {
//            if (number % i == 0){
//                System.out.println(i + " ");
//            }
//            ++i;
//        }

// Q23 - Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)



    }
}
