package com.example;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

}
