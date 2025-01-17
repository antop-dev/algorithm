package kr.co.programmers;

public class P12971 {
    public int solution(int[] sticker) {
        int n = sticker.length;
        return switch (n) {
            case 1 -> sticker[0];
            case 2 -> Math.max(sticker[0], sticker[1]);
            default -> Math.max(dp(sticker, 0, n - 1), dp(sticker, 1, n));
        };
    }

    private int dp(int[] sticker, int s, int e) {
        int[] dp = new int[sticker.length];
        dp[s] = sticker[s];
        dp[s + 1] = Math.max(sticker[s], sticker[s + 1]);

        for (int i = s + 2; i < e; i++) {
            dp[i] = Math.max(dp[i - 2] + sticker[i], dp[i - 1]);
        }

        return dp[e - 1];
    }
}
