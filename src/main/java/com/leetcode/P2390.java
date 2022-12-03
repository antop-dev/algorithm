package com.leetcode;

import java.util.Stack;

// https://github.com/antop-dev/algorithm/issues/438
public class P2390 {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
            System.out.println("'" + c + "' -> " + stack);
        }
        // stack to string
        char[] chars = new char[stack.size()];
        for (int i = chars.length - 1; i >= 0; i--) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
}
