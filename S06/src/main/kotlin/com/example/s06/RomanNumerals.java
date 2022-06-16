package com.example.s06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    public static String toRoman(int decimal) {
        String result = "";
        LinkedHashMap<String, Integer> romanToDecimalMap = new LinkedHashMap<String, Integer>();
        romanToDecimalMap.put("M", 1000);
        romanToDecimalMap.put("CM", 900);
        romanToDecimalMap.put("D", 500);
        romanToDecimalMap.put("CD", 400);
        romanToDecimalMap.put("C", 100);
        romanToDecimalMap.put("XC", 90);
        romanToDecimalMap.put("L", 50);
        romanToDecimalMap.put("X", 10);
        romanToDecimalMap.put("IX", 9);
        romanToDecimalMap.put("V", 5);
        romanToDecimalMap.put("IV", 4);
        romanToDecimalMap.put("I", 1);

        for(Map.Entry<String, Integer> entry : romanToDecimalMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            while (decimal>=value){
                result += key;
                decimal = decimal - value;
            }
        }
        return result;
    }
}
