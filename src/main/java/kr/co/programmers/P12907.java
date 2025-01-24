package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/620
public class P12907 {
    public int solution(int n, int[] money) {
        var dp = new int[n + 1];
        dp[0] = 1;

        for (var m : money) {
            for (var j = m; j <= n; j++) {
                dp[j] += dp[j - m];
            }
        }
        return dp[n];
    }
}
