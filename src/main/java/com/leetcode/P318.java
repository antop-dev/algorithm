package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// https://github.com/antop-dev/algorithm/issues/412
public class P318 {

    public int maxProduct(String[] words) {
        // 중복 제거
        List<Set<Character>> list = Arrays.stream(words)
                .map(this::toSet)
                .collect(Collectors.toList());

        int max = 0;
        int length = words.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (!match(list.get(i), list.get(j))) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }

        return max;
    }

    // "mmmeee" -> ['m', 'e']
    private Set<Character> toSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set;
    }

    private boolean match(Set<Character> x, Set<Character> y) {
        for (char c : x) {
            if (y.contains(c)) {
                return true;
            }
        }
        return false;
    }

}
