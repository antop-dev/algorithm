package com.leetcode

// https://github.com/antop-dev/algorithm/issues/492
class P91 {
    fun numDecodings(s: String): Int {
        if (s[0] == '0') return 0
        // 계산식을 단순화하기 위해서 앞에 한자리를 더 둔다.
        val nums = IntArray(s.length + 1).apply {
            for (i in s.indices) this[i + 1] = s[i] - '0'
        }
        val dp = IntArray(s.length + 1).apply {
            this[0] = 1
            this[1] = 1
        }
        for (i in 2 until nums.size) {
            val n = nums[i - 1] * 10 + nums[i]
            // i번째 한자리
            dp[i] += if (n % 10 != 0) dp[i - 1] else 0
            // i번째 두자리
            dp[i] += if (n in 10..26) dp[i - 2] else 0
        }
        return dp.last()
    }

}
