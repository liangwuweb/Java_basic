package com.liangwu.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int intValue1 = 56;
    int intValue2 = 42;

    int result1 = intValue1 + intValue2;
    System.out.println("addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("subtraction: " + result1);

        int result3 = intValue1 * intValue2;
        System.out.println("multiplication: " + result3);

        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result4);

        double result5 = (double) intValue1 % intValue2;
        System.out.println("remainder: " + result5);

        double doubleValue = -2.888;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded: " + rounded);

        System.out.println("rounded & abs: " + Math.round(Math.abs(doubleValue)));





    }
}
