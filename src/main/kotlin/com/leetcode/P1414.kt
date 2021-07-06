package com.leetcode

// https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/
class P1414 {
    fun findMinFibonacciNumbers(k: Int): Int {
        val dp = mutableListOf(0, 1)

        while (dp.last() < k) {
            val v = dp[dp.lastIndex] + dp[dp.lastIndex - 1]
            if (v > k) break
            dp += v
        }

        var times = 0
        var sum = 0
        while (sum < k) {
            val v = dp.removeAt(dp.lastIndex)
            if (sum + v <= k) {
                sum += v
                times++
            }
        }

        return times
    }
}
