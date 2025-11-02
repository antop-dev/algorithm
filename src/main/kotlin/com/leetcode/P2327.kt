package com.leetcode

// https://github.com/antop-dev/algorithm/issues/694
class P2327 {
    fun peopleAwareOfSecret(n: Int, delay: Int, forget: Int): Int {
        val modulo = 1_000_000_007
        var share = 0L // 비밀을 알고 있는 사람의 (누적) 수
        // dp[day] : 해당 일에 비밀을 알고 있는 사람의 수
        val dp = IntArray(n + 1)
        dp[1] = 1

        for (day in 2..n) {
            if (day - delay >= 0) {
                share += dp[day - delay]
            }
            if (day - forget >= 0) {
                share -= dp[day - forget]
            }
            share = (share + modulo) % modulo
            dp[day] = share.toInt()
        }
        // 비밀을 잊지 않은 사람들의 범위 합계
        // n = 4, forget = 3 일경우 2,3,4일차에 해당하는 사람들만 기억이 유효하다.
        var ans = 0
        for (day in n - forget + 1..n) {
            ans = (ans + dp[day]) % modulo
        }
        return ans
    }
}