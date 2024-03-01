package com.leetcode

// https://github.com/antop-dev/algorithm/issues/541
class P2364 {
    fun countBadPairs(nums: IntArray): Long {
        val n = nums.size
        // Hint 3
        val counter = mutableMapOf<Int, Long>()
        for (i in 0 until n) {
            val v = nums[i] - i // Hint 2
            counter[v] = (counter[v] ?: 0) + 1
        }
        // Hint 1
        val total = (n.toLong() * (n - 1)) / 2
        var goodPair = 0L
        for ((_, v) in counter) {
            if (v > 1) {
                goodPair += (v * (v - 1)) / 2
            }
        }
        return total - goodPair
    }

}
