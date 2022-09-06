package com.liangwu.java;
import java.text.NumberFormat;

public class Main {
    static boolean def;

    public static void main(String[] args) {
	    // write your code here
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);
    }
}
