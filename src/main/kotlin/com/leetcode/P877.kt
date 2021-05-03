package com.leetcode

// https://github.com/antop-dev/algorithm/issues/256
class P877 {

    fun stoneGame(piles: IntArray): Boolean {
        val n = piles.size
        val dp = Array(n + 2) { Array(n + 2) { 0 } }
        for (size in 1..n) {
            var i = 0
            while (i + size <= n) {
                val j = i + size - 1
                val parity = (j + i + n) % 2
                dp[i + 1][j + 1] =
                    if (parity == 1)
                        maxOf(piles[i] + dp[i + 2][j + 1], piles[j] + dp[i + 1][j])
                    else
                        minOf(-piles[i] + dp[i + 2][j + 1], -piles[j] + dp[i + 1][j])

                i++
            }
        }
        return dp[1][n] > 0
    }

}
