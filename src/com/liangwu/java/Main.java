package com.liangwu.java;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    static boolean def;

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        if (str1 == str2) {
            System.out.println("They match");
        } else {
            System.out.println("They don't match");
        }

        String part1 = "Hello ";
        String part2 = "World";
        String str4 = part1 + part2;
        String str5 = "Hello World";
        if (str4.equals(str5)) {
            System.out.println("match");
        } else {
            System.out.println("no match");
        }

    }
}
