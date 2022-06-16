package com.example.s06;

import java.util.ArrayList;

public class PrimeFactors {
    public PrimeFactors() {
    }

    public ArrayList<Integer> decompose(int number) {
        if (number == 2 ||number==3) {
            ArrayList factors = new ArrayList<>();
            factors.add(number);
            return factors;
        }
        return new ArrayList<>();
    }
}
