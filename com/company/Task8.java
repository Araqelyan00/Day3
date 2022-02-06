package com.company;
/*
Try to print this text
String txt = "We are the so-called "Vikings" from the north.";
There is problem with word “Vikings”

      * How to solve 12 problem
We can use backslash for word “Vikings”
String txt = "We are the so-called \"Vikings"\ from the north.";

\n                     New Line
\r                          Carriage return
\t                          Tab
\b                         backslash
try with this features print txt

*/
public class Task8 {
    public static void main(String[] args) {
        String txt = "We are the so-called \"Vikings\" from the north.";
        String txt1 = "We are the so-called \n Vikings from the north.";
        String txt2 = "We are the so-called \r Vikings from the north.";
        String txt3 = "We are the so-called \t Vikings from the north.";
        String txt4 = "We are the so-called \b Vikings from the north.";
        System.out.println(txt);
        System.out.println(txt1);
        System.out.println(txt2);
        System.out.println(txt3);
        System.out.println(txt4);
    }
}
