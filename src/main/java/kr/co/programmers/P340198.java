package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/644
public class P340198 {
    public int solution(int[] mats, String[][] park) {
        int n = park.length;
        int m = park[0].length;
        int[][] dp = new int[n + 1][m + 1];

        int possible = 0; // 가능한 최대 타일 크기
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (park[i][j].equals("-1")) {
                    dp[i][j] = 1 + minOf(dp[i][j + 1], dp[i + 1][j], dp[i + 1][j + 1]);
                    possible = Math.max(possible, dp[i][j]);
                }
            }
        }
        // 가지고 있는 돗자리 중 가능한 가장 큰 돗자리 찾기
        int ans = -1;
        for (int mat : mats) {
            if (mat <= possible) {
                ans = Math.max(mat, ans);
            }
        }
        return ans;
    }

    private int minOf(int... ints) {
        int min = ints[0];
        for (int v : ints) {
            min = Math.min(min, v);
        }
        return min;
    }
}
