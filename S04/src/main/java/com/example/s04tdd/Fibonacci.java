package com.example.s04tdd;

public class Fibonacci {
    public Integer findNthElement(int elem) {
        int num1 = 0;
        int num2 = 1;
        int result = 0;
        int counter = 2;

        if (elem == 1) return num1;
        if (elem == 2) return num2;

        while (counter < elem) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
            counter++;
        }

        return result;
    }
}
