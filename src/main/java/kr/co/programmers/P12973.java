package kr.co.programmers;

import java.util.Stack;

// https://github.com/antop-dev/algorithm/issues/251
public class P12973 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            while (stack.size() >= 2) {
                char c2 = stack.pop();
                char c1 = stack.pop();
                if (c1 != c2) {
                    stack.push(c1);
                    stack.push(c2);
                    break;
                }
            }
        }
        return stack.size() == 0 ? 1 : 0;
    }
}
