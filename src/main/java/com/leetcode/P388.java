package com.leetcode;

import java.util.Stack;

// https://github.com/antop-dev/algorithm/issues/443
public class P388 {
    public int lengthLongestPath(String input) {
        int max = 0;
        int length = 0;

        Stack<String> stack = new Stack<>();
        String[] lines = input.split("\n");
        for (String line : lines) {
            int tabCount = 0; // 탭의 갯수
            int idx = line.lastIndexOf("\t");
            if (idx > -1) {
                tabCount = idx + 1; // 탭(\t)이 문자 한개로 인식된다.
                line = line.substring(idx + 1); // 탭 문자 제거
            }
            // 같은 레벨의 경로를 제거
            while (stack.size() > tabCount) {
                length -= stack.pop().length();
            }

            stack.push(line);
            // 현재 스택에 들어가 있는 경로들 중 "/"를 제외한 길이
            length += line.length();

            if (line.contains(".")) { // 파일명일 경우
                int len = length + stack.size() - 1; // 경로의 길이
                if (len > max) {
                    max = len;
                }
            }

        }

        return max;
    }

}
