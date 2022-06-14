package com.example.s06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class PrimeFactorsTest {
    @Test
    void canInstantiate() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(1);
        Assertions.assertEquals(0, factors.size());
    }

    @Test
    void numberTwoIsPrime() {
        ArrayList<Integer> factors = new PrimeFactors().decompose(2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);

        Assertions.assertEquals(expected, factors);
    }
}