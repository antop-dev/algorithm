package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/687
public class P1832 {
    private static final int MOD = 20170805;

    private static final int LEFT = 0; // 왼쪽에서 오른쪽으로
    private static final int UP = 1; // 위에서 아래로

    private static final int PASSAGE = 0; // 통행
    private static final int CURFEW = 1; // 통행 금지

    public int solution(int m, int n, int[][] cityMap) {
        var dp = new int[m][n][2];
        // 1행
        for (int i = 0; i < n; i++) {
            if (cityMap[0][i] == 1) break;
            dp[0][i][LEFT] = 1;
        }
        // 1열
        for (int i = 0; i < m; i++) {
            if (cityMap[i][0] == 1) break;
            dp[i][0][UP] = 1;
        }
        // 2행 2열부터 계산
        for (int y = 1; y < m; y++) {
            for (int x = 1; x < n; x++) {
                calculate(dp, cityMap, y, x);
            }
        }

        return (dp[m - 1][n - 1][0] + dp[m - 1][n - 1][1]) % MOD;
    }

    private void calculate(int[][][] dp, int[][] cityMap, int y, int x) {
        // 통행금지면 계산 안함
        if (cityMap[y][x] == CURFEW) return;
        // 왼쪽에서 오른쪽
        int left = dp[y][x - 1][LEFT];
        if (cityMap[y][x - 1] == PASSAGE) {
            left = (left + dp[y][x - 1][UP]) % MOD;
        }
        // 위에서 아래
        int up = dp[y - 1][x][UP];
        if (cityMap[y - 1][x] == PASSAGE) {
            up = (up + dp[y - 1][x][LEFT]) % MOD;
        }
        dp[y][x][LEFT] = left;
        dp[y][x][UP] = up;
    }
}
