package com.company;

import java.util.Scanner;

/*
Input int value from console, find char value
corresponding to that int value.Output ` 65 - A.
 (input int in range 32 to 127)
*/
public class Task6 {
    public static void main(String[] args) {
        System.out.print("Please input number to change: num = ");
        Scanner scanner = new Scanner(System.in);
        int numToChar = scanner.nextInt();
        char outChar = (char) numToChar;
        System.out.println("Char type of this number is - " + outChar);
    }
}
