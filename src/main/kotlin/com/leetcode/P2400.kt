package com.leetcode

// https://github.com/antop-dev/algorithm/issues/625
class P2400 {
    fun numberOfWays(startPos: Int, endPos: Int, k: Int): Int {
        val dp = Array(3000) { IntArray(3000) { -1 } }
        return helper(startPos, endPos, k, dp)
    }

    val p = 1e9.toInt() + 7

    private fun helper(startPos: Int, endPos: Int, k: Int, dp: Array<IntArray>): Int {
        if (startPos == endPos && k == 0) {
            return 1
        }
        if (k == 0) {
            return 0
        }

        if (dp[startPos + 1000][k] != -1) {
            return dp[startPos + 1000][k]
        }

        val left = helper(startPos - 1, endPos, k - 1, dp)
        val right = helper(startPos + 1, endPos, k - 1, dp)
        dp[startPos + 1000][k] = (left + right) % p

        return dp[startPos + 1000][k]
    }
}
