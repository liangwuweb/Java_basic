package com.liangwu.java;

import java.math.BigDecimal;

public class MaxValues {
    public static void main(String[] args) {
        double value = 0.1222222;
        double sum = value * 3;
        System.out.println("sum " + sum);

        String strValue = Double.toString(value);
        System.out.println("strValue " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bsum = bigValue.add(bigValue).add(bigValue);
        System.out.println("sum " + bsum);
    }
}
