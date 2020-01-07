package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class P12922 {
    public String solution(int n) {
        String answer = "";

        String[] w = new String[]{"수", "박"};

        for (int i = 0; i < n; i++) {
            answer += w[i % 2];
        }

        return answer;
    }
}
