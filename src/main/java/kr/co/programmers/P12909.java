package kr.co.programmers;

import java.util.ArrayDeque;

// https://github.com/antop-dev/algorithm/issues/588
public class P12909 {
    public boolean solution(String s) {
        var stack = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else if (stack.peek() == '(') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
