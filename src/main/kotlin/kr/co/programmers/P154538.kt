package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/476
class P154538 {
    fun solution(x: Int, y: Int, n: Int): Int {
        val dp = IntArray(y + 1) { Int.MAX_VALUE }
        dp[x] = 0

        for (i in x until dp.size) {
            if (dp[i] == Int.MAX_VALUE) {
                continue
            }
            if (i + n <= y) {
                dp[i + n] = minOf(dp[i + n], dp[i] + 1)
            }
            if (i * 2 <= y) {
                dp[i * 2] = minOf(dp[i * 2], dp[i] + 1)
            }
            if (i * 3 <= y) {
                dp[i * 3] = minOf(dp[i * 3], dp[i] + 1)
            }
        }
        if (dp[y] == Int.MAX_VALUE) {
            dp[y] = -1
        }
        return dp[y]
    }
}
