package com.company;

import java.util.Scanner;

/*
Narrowing Primitive Conversion (Explicit)

Write java program, which has double type variable(Input variable from console)
Cast double  to float,print both variables
Cast float to long, print both variables
Cast long to int, print both variables
Cast int to short, print both results
Cast short to byte, print both results

*/
public class Task2 {
    public static void main(String[] args) {
        System.out.print("Input a byte number from -128 to 127: num = ");
        Scanner scanner = new Scanner(System.in);
        double inputNumber = scanner.nextDouble();
        float changedNumber = (float) inputNumber;
        System.out.println("Byte - " + inputNumber);
        System.out.println("Short - " + changedNumber);
        long changedNumber2 = (long) changedNumber;
//        System.out.println("Short" + changedNumber);
        System.out.println("Int - " + changedNumber2);
        int changedNumber3 = (int) changedNumber2;
//        System.out.println("Int" + changedNumber2);
        System.out.println("Long - " + changedNumber3);
        short changedNumber4 = (short) changedNumber3;
//        System.out.println("Long" + changedNumber3);
        System.out.println("Float - " + changedNumber4);
        byte changedNumber5 = (byte) changedNumber4;
//        System.out.println("Float" + changedNumber4);
        System.out.println("Double - " + changedNumber5);
    }
}
