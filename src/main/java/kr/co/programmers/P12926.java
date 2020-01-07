package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */
public class P12926 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') { // 대문자
                int nc = c + n;
                if (nc > 90) { // Z -> A
                    nc -= 26;
                }
                answer.append((char) nc);
            } else if (c >= 'a' && c <= 'z') { // 소문자
                int nc = c + n;
                if (nc > 122) { // z -> a
                    nc -= 26;
                }
                answer.append((char) nc);
            } else { // 공백
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}
