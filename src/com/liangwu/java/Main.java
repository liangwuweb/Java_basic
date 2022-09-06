package com.liangwu.java;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    static boolean def;

    public static void main(String[] args) {
	    // write your code here
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Value: ");
//        String input = scanner.nextLine();
//        System.out.println(input);

        // Delete sb
        sb.delete(0, sb.length());
        System.out.println(sb);

        for(int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            sb.append(input + "\n");
        }

        System.out.println(sb);
    }
}
