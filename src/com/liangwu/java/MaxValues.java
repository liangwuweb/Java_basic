package com.liangwu.java;

public class MaxValues {
    public static void main(String[] args) {
        byte b = 127;
        if (b < Byte.MAX_VALUE) {
            b++;
        }
        System.out.println(b);
    }
}
