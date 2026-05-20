package com.receiptorc.service;

import java.util.*;

public class Solution {
    void main() {
        System.out.println(romanToInt("IVIXIXL"));
    }


    public int romanToInt(String s) {
        int resultado = 0;

        Map<String, Integer> romanValues = new LinkedHashMap<>();
        romanValues.put("I", 1);
        romanValues.put("V", 5);
        romanValues.put("X", 10);
        romanValues.put("L", 50);
        romanValues.put("C", 100);
        romanValues.put("D", 500);
        romanValues.put("M", 1000);

        Map<String, Integer> combinations = new LinkedHashMap<>();
        combinations.put("IV", 4);
        combinations.put("IX", 9);
        combinations.put("XL", 40);
        combinations.put("XC", 90);
        combinations.put("CD", 400);
        combinations.put("CM", 900);

        String[] romanStringList = s.split("");

        for (int i = 0; i < romanStringList.length; i++) {
            if (i == romanStringList.length - 1){
                resultado += romanValues.get(romanStringList[i]);
                continue;
            }

            // If the combinations have IV, take the value and plus 1 in i
            if (combinations.containsKey(romanStringList[i] + romanStringList[i + 1])) {
                // Here we take the result of this combination
                resultado += combinations.get(romanStringList[i] + romanStringList[i + 1]);
                i += 1; // Skip second combination's value
                continue;
            }

            resultado += romanValues.get(romanStringList[i]);
        }

        return resultado;
    }
}
