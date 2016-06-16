package com.hp.ccp.dojo;

import java.util.HashMap;
import java.util.Map;

public class PrimeWordsImpl implements PrimeWords {

    Map<String, Integer> mapper = new HashMap<String, Integer>();

    public PrimeWordsImpl() {
        mapper.put("a", 1);
        mapper.put("b", 2);
        mapper.put("c", 3);
        mapper.put("d", 4);
        mapper.put("e", 5);
        mapper.put("f", 6);
        mapper.put("g", 7);
        mapper.put("h", 8);
        mapper.put("i", 9);
        mapper.put("j", 10);
        mapper.put("k", 11);
        mapper.put("l", 12);
        mapper.put("m", 13);
        mapper.put("n", 14);
        mapper.put("o", 15);
        mapper.put("p", 16);
        mapper.put("q", 17);
        mapper.put("r", 18);
        mapper.put("s", 19);
        mapper.put("t", 20);
        mapper.put("u", 21);
        mapper.put("v", 22);
        mapper.put("w", 23);
        mapper.put("x", 24);
        mapper.put("y", 25);
        mapper.put("z", 26);
    }
    public boolean isPrimeWord(String word) {

        return false;
    }

    public int sumPrimeWord(String word) {
        int value = 0;
        char[] letters = word.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            // if the char is a letter, we sum the corresponding value
            if (Character.isLetter(letters[i])) {
                if (Character.isUpperCase(letters[i])) {
                    value += mapper.get(Character.toLowerCase(letters[i])) + 26;
                } else {
                    value += mapper.get(letters[i]);
                }
            }
            // if the char is not a letter, we ignore it
        }
        return value;
    }
}
