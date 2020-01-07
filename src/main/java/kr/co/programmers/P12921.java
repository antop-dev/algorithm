package kr.co.programmers;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 */
public class P12921 {
    public int solution(int n) {
        System.out.println("n = " + n);
        // 배열 값이 1이면 소수 0이면 소수 아님
        int[] prime = new int[n];
        for (int i = 0; i < n; i++) {
            prime[i] = 1;
        }
        prime[0] = 0; // 1은 소수가 아니다

        System.out.println("prime = " + Arrays.toString(prime));

        for (int i = 2; i < Math.sqrt(n); i++) {
            // 에라토스테네스의 체
            System.out.println();
            System.out.println("i = " + i);

            for (int j = i * 2; j <= n; j += i) {
                if (prime[j - 1] == 1) {
                    System.out.println("not prime = " + j);
                    prime[j - 1] = 0;
                }
            }
        }

        System.out.println();
        System.out.println("prime = " + Arrays.toString(prime));

        int answer = 0;
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] == 1) {
                answer++;
            }
        }

        System.out.println("answer = " + answer);

        return answer;
    }
}
