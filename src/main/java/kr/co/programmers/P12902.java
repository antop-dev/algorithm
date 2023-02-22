package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/468
public class P12902 {
    private int x = 1000000007;

    public int solution(int n) {
        long[] dp = new long[n + 1];
        dp[2] = 3;
        dp[4] = 11;
        for (int i = 6; i <= n; i += 2) {
            dp[i] = ((dp[i - 2] * 4 % x) - (dp[i - 4] % x) + x) % x;
        }
        return (int) dp[n];
    }
}
