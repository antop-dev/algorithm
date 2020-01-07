package kr.co.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 */
public class P12928 {
    public int solution(int n) {
        System.out.println("n = " + n);
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("i = " + i);
                answer += i;
            }
        }

        return answer + n;
    }
}
