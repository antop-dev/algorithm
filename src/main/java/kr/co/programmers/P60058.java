package kr.co.programmers;

import java.util.Stack;

// https://school.programmers.co.kr/learn/courses/30/lessons/60058
public class P60058 {
    public String solution(String p) {
        // 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
        if (p.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        // 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다.
        int count = 0;
        // 균형잡힌 괄호 분리 지점 찾기
        int i = 0;
        while (i < p.length()) {
            char c = p.charAt(i);
            count += (c == '(') ? 1 : -1;
            if (count == 0) {
                break;
            }
            i++;
        }
        // 분리
        String u = p.substring(0, i + 1);
        String v = p.substring(i + 1);

        if (isValid(u)) {
            // 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
            //  3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
            sb.append(u);
            sb.append(solution(v));
        } else {
            // 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
            //  4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
            //  4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
            //  4-3. ')'를 다시 붙입니다.
            //  4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
            //  4-5. 생성된 문자열을 반환합니다.
            sb.append('(');
            sb.append(solution(v));
            sb.append(')');

            for (int j = 1; j < u.length() - 1; j++) {
                if (u.charAt(j) == '(') {
                    sb.append(')');
                } else {
                    sb.append('(');
                }
            }
        }

        return sb.toString();
    }

    // 올바른 괄호 검사
    private boolean isValid(String p) {
        Stack<Character> stack = new Stack<>();
        for (char c : p.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else { // ')'
                if (stack.empty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
