package com.liangwu.java;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        int monthNumber = Integer.parseInt(input);

        switch (monthNumber) {
            case 1:
                System.out.println("The month is Jan");
                break;
            case 2:
                System.out.println("The month is Feb");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            default:
                System.out.println("You choose another month");
        }
    }
}
