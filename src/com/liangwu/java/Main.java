package com.liangwu.java;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric Value: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter a numeric Value: ");
        String input2 = scanner.nextLine();

        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);

        int sum = a + b;
        System.out.println("Sum is: " + sum);



    }
}
