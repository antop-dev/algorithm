package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

// https://github.com/antop-dev/algorithm/issues/446
public class P921 {
    public int minAddToMakeValid(String s) {
        int moves = 0;
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else { // ')'
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else { // 스택에 여는 괄호가 없다.
                    moves++;
                }
            }
        }
        return moves + stack.size();
    }
}
