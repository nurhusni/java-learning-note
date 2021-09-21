package com.nurhusni.startjavabc;

public class BC04Math {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double maxValue = Math.max(x, y); // Returns 3.14
        double minValue = Math.min(x, y); // Returns -10.0
        double absValue = Math.abs(y); // Returns 10.0

        double roundValue = Math.round(x); // Returns 3.0
        double roundUpValue = Math.ceil(x); // Returns 4.0
        double roundDownValue = Math.floor(x); // Returns 3.0

        System.out.println(roundValue + " " + roundUpValue + " " + roundDownValue);
    }
}
