package com.liangwu.java;

import java.util.Scanner;


public class Main {
    static String[] months = {"Jan", "Feb", "Mar", "April", "May", "June",
            "July", "August", "Sep", "Oct", "Nov", "Dec"};
    public static void main(String[] args) {
        loopIt("Month of the year");
        loopIt("Second run");
    }

    static void loopIt(String label) {
        System.out.println(label);

        for (int i = 0; i < label.length(); i++) {
            System.out.print("#");
        }

        System.out.println("");

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
    }
}
