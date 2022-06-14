package com.example.s06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// is there any toRoman function.
// is toRoman funtion return something
// is there any parameter enter toRoman function
class RomanNumeralsTest {
    @Test
    void should_return_I_for_one() {
        String roman = RomanNumerals.toRoman(1);

        Assertions.assertEquals("I", roman);
    }

    @Test
    void should_return_II_for_two() {
        String roman = RomanNumerals.toRoman(2);

        Assertions.assertEquals("II", roman);
    }

    @Test
    void should_return_III_for_three() {
        String roman = RomanNumerals.toRoman(3);

        Assertions.assertEquals("III", roman);
    }

    @Test
    void should_return_IV_for_four() {
        String roman = RomanNumerals.toRoman(4);

        Assertions.assertEquals("IV", roman);
    }

    @Test
    void should_return_V_for_five() {
        String roman = RomanNumerals.toRoman(5);

        Assertions.assertEquals("V", roman);
    }

    @Test
    void should_return_VI_for_six() {
        String roman = RomanNumerals.toRoman(6);

        Assertions.assertEquals("VI", roman);
    }

    @Test
    void should_return_VI_for_seven() {
        String roman = RomanNumerals.toRoman(7);

        Assertions.assertEquals("VII", roman);
    }

    @Test
    void should_return_VI_for_eight() {
        String roman = RomanNumerals.toRoman(8);

        Assertions.assertEquals("VIII", roman);
    }

    @Test
    void should_return_IX_for_nine() {
        String roman = RomanNumerals.toRoman(9);

        Assertions.assertEquals("IX", roman);
    }


    @Test
    void should_return_X_for_ten() {
        String roman = RomanNumerals.toRoman(10);

        Assertions.assertEquals("X", roman);
    }

    @Test
    void should_return_XI_for_eleven() {
        String roman = RomanNumerals.toRoman(11);

        Assertions.assertEquals("XI", roman);
    }

    @Test
    void should_return_XII_for_twelve() {
        String roman = RomanNumerals.toRoman(12);

        Assertions.assertEquals("XII", roman);
    }

    @Test
    void should_return_XV_for_fifteen() {
        String roman = RomanNumerals.toRoman(15);

        Assertions.assertEquals("XV", roman);
    }

    @Test
    void should_return_XXV_for_twenty_five() {
        String roman = RomanNumerals.toRoman(25);

        Assertions.assertEquals("XXV", roman);
    }

    @Test
    void should_return_XXXV_for_thirty_five() {
        String roman = RomanNumerals.toRoman(35);

        Assertions.assertEquals("XXXV", roman);
    }



    @Test
    void should_return_L_for_fifty() {
        String roman = RomanNumerals.toRoman(50);

        Assertions.assertEquals("L", roman);
    }


    @Test
    void should_return_LXXXIX_for_eighty_nine() {
        String roman = RomanNumerals.toRoman(89);

        Assertions.assertEquals("LXXXIX", roman);
    }

    @Test
    void should_return_C_for_hundred() {
        String roman = RomanNumerals.toRoman(100);

        Assertions.assertEquals("C", roman);
    }


    @Test
    void should_return_CCXCIV_for_294() {
        String roman = RomanNumerals.toRoman(294);

        Assertions.assertEquals("CCXCIV", roman);
    }

    @Test
    void should_return_CD_for_four_hundred() {
        String roman = RomanNumerals.toRoman(400);

        Assertions.assertEquals("CD", roman);
    }

    @Test
    void should_return_D_for_five_hundred() {
        String roman = RomanNumerals.toRoman(500);

        Assertions.assertEquals("D", roman);
    }

    @Test
    void should_return_CM_for_nine_hundred() {
        String roman = RomanNumerals.toRoman(900);

        Assertions.assertEquals("CM", roman);
    }

    @Test
    void should_return_M_for_tousand() {
        String roman = RomanNumerals.toRoman(1000);

        Assertions.assertEquals("M", roman);
    }


    @Test
    void should_return_MMXIX_for_2019() {
        String roman = RomanNumerals.toRoman(2019);

        Assertions.assertEquals("MMXIX", roman);
    }
}