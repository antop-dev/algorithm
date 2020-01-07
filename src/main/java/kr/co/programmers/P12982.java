package kr.co.programmers;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 */
public class P12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            int n = d[i];
            if (n > budget) {
                break;
            }
            budget -= n;
            answer++;
        }
        return answer;
    }
}
