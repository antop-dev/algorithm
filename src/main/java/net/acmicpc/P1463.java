package net.acmicpc;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1463
 */
public class P1463 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] memo = new int[N + 1];
        int ans = dp(memo, N);

        System.out.println(ans);
    }

    private static int dp(int[] memo, int N) {
        if (N <= 1) {
            return 0;
        }

        int c = memo[N]; // 입력된 수를 배열의 인덱스로 사용
        if (c > 0) { // 테이블에 값이 있으면 그 값을 사용
            return c;
        }

        int min = dp(memo, N - 1);
        if (N % 3 == 0) {
            min = Math.min(min, dp(memo, N / 3));
        }
        if (N % 2 == 0) {
            min = Math.min(min, dp(memo, N / 2));
        }

        memo[N] = min + 1;

        return memo[N];
    }
}
