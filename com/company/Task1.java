package com.company;

import java.util.Scanner;

/*
Widening Primitive Conversion (Implicit)
Write java program, which has byte type variable(Input variables from console)
Cast byte to short type, print both variables
Cast short to int  type, print both variables
Cast int to long, print both variables
Cast long to float, print both variables
Cast float to double type, print both variables
*/
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Input a byte number from -128 to 127: num = ");
        Scanner scanner = new Scanner(System.in);
        byte inputNumber = scanner.nextByte();
        short changedNumber = inputNumber;
        System.out.println("Byte - " + inputNumber);
        System.out.println("Short - " + changedNumber);
        int changedNumber2 = changedNumber;
//        System.out.println("Short" + changedNumber);
        System.out.println("Int - " + changedNumber2);
        long changedNumber3 = changedNumber2;
//        System.out.println("Int" + changedNumber2);
        System.out.println("Long - " + changedNumber3);
        float changedNumber4 = changedNumber3;
//        System.out.println("Long" + changedNumber3);
        System.out.println("Float - " + changedNumber4);
        double changedNumber5 = changedNumber4;
//        System.out.println("Float" + changedNumber4);
        System.out.println("Double - " + changedNumber5);
    }
}
