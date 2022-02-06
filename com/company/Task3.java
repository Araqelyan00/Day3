package com.company;

import java.util.Scanner;

/*
Write a Java program to convert temperature from Fahrenheit to
 Celsius degree. (Input parameter from console)
Print the result
Cast the result to float type,print float type
Cast result to int,print int type
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = scanner.nextInt();
        int celsius = (fahrenheit-32)*5/9;
        System.out.println(celsius);
        float cels = celsius;
        System.out.println(cels);
        int finallyCelsius = (int) cels;
        System.out.println(finallyCelsius);
    }
}
