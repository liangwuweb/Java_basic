package com.liangwu.java;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String s1 = "Welcome to Wisconsin!";
        System.out.println("Length of string: " + s1.length());

        int position = s1.indexOf("Wisconsin");
        System.out.println("Position of substring: " + position);

        String s2 = "welcome! ";
        int len1 = s2.length();
        System.out.println(len1);
        String s3 = s2.trim();
        System.out.println(s3.length());
    }
}
