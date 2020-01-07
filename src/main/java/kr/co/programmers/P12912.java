package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */
public class P12912 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a == b) {
            return a;
        }
        int s = a < b ? a : b;
        int e = a > b ? a : b;

        for (int i = s; i <= e; i++) {
            answer += i;
        }
        return answer;
    }
}
