package com.liangwu.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int intValue1 = 56;

    long longValue = intValue1;
    System.out.println("long value is " + longValue);

    short shortValue = (short) intValue1;
        System.out.println("short value is " + shortValue);

    int intValue2 = 1028;
    byte byteValue = (byte) intValue2;
    System.out.println("byte value is " + byteValue);

    double doubleValue = 3.999999d;
    int intValue3 = (int) doubleValue;
    System.out.println("Int value is " + intValue3);



    }
}
