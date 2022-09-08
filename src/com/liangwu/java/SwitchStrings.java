package com.liangwu.java;

import java.util.Scanner;


public class SwitchStrings {

    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "April", "May", "June",
                "July", "August", "Sep", "Oct", "Nov", "Dec"};

        // incremental loop
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }

//        for (int i = months.length - 1; i >= 0; i--) {
//            System.out.println(months[i]);
//        }

        //for each loop
//        for (String month : months) {
//            System.out.println(month);
//        }

        // While loop
//        int counter = 0;
//        while (counter < months.length) {
//            System.out.println(months[counter]);
//            counter++;
//        }

        // Do while
        int counter = 0;
        do {
            System.out.println(months[counter]);
            counter++;
        } while (counter < months.length);

    }
}
