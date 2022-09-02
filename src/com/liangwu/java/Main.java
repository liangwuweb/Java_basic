package com.liangwu.java;

public class Main {
    static boolean def;

    public static void main(String[] args) {
	// write your code here
    boolean b1 = true;
    boolean b2 = false;

    System.out.println("the value of b1 is: " + b1);
    System.out.println("the value of b2 is: " + b2);
        System.out.println("the value of def is: " + def);

    boolean b3 = !b1;
        System.out.println("the value of b3 is: " + b3);

    int x = 0;
    boolean b4= (x == 0);
        System.out.println("the value of b4 is: " + b4);

    String sBoolean = "true";
    boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("the value of parsed is: " + parsed);











    }
}
