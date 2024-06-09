package kr.co.programmers;

public class P42898 {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n + 1][m + 1];
        dp[0][1] = 1;

        for (int[] puddle : puddles) { // 물웅덩이 표시
            dp[puddle[1]][puddle[0]] = -1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (dp[i][j] == -1) { // 물웅덩이
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
                dp[i][j] %= 1_000_000_007;
            }
        }

        return dp[n][m];
    }
}
