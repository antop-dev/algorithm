package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */
public class P12930 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean upper = true;

        for (String c : s.split("")) {
            answer.append(upper ? c.toUpperCase() : c.toLowerCase());
            upper = " ".equals(c) ? true : !upper;
        }

        return answer.toString();
    }
}
