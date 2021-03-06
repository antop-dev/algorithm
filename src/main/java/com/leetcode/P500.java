package com.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/keyboard-row/
public class P500 {

    public String[] findWords(String[] words) {
        final String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        return Arrays.stream(words).filter(it -> {
            for (String row : keyboard) {
                int count = 0;
                for (char c : it.toCharArray()) {
                    if (c <= 90) c += 32;
                    if (row.indexOf(c) > -1) count++;
                }
                if (count == it.length()) return true;
            }
            return false;
        }).toArray(String[]::new);
    }

}
