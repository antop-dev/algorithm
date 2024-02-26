package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/542
class P12914 {
    fun solution(n: Int): Long {
        if (n == 1) return 1
        if (n == 2) return 2

        val dp = LongArray(n)
        dp[0] = 1
        dp[1] = 2

        for (i in 2 until n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp.last() % 1234567
    }
}
