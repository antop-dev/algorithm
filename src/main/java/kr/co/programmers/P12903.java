package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */
public class P12903 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        int center = chars.length / 2;

        String answer = "" + chars[center];
        if (chars.length % 2 == 0) { // 짝수 길이 문자열일 경우
            answer = chars[center - 1] + answer;
        }

        return answer;
    }
}
