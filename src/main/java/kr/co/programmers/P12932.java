package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 */
public class P12932 {
    public int[] solution(long n) {
        int l = (int) (Math.log10(n) + 1);
        int[] answer = new int[l];

        for (int i = 0; i < l; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}
