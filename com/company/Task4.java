package com.company;

import java.util.Scanner;

/*
Compute area  and perimeter of circle.
(Input double type radius from console)(PI = 3.14159)
area = PI*r*r
perimeter = 2*PI*r
*/
public class Task4 {
    public static void main(String[] args) {
        System.out.print("Please input radius of circle: r = ");
        Scanner scanner = new Scanner(System.in);
        double radiusOfCircle = scanner.nextDouble();
        double numberPI = 3.14159;
        double area = numberPI * radiusOfCircle * radiusOfCircle;
        double perimeter = 2 * numberPI * radiusOfCircle;
        System.out.println("Area of circle is equal to: area = " + area);
        System.out.println("Perimeter of circle is equal to: perimeter = " + perimeter);
    }
}
