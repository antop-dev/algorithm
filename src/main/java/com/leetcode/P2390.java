package com.leetcode;

import java.util.ArrayList;
import java.util.List;

// https://github.com/antop-dev/algorithm/issues/438
public class P2390 {
    public String removeStars(String s) {
        List<Character> list = new ArrayList<>(s.length());
        for (char c : s.toCharArray()) {
            if (c == '*') {
                list.remove(list.size() - 1);
            } else {
                list.add(c);
            }
        }
        // list to string
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}
