package com.leetcode

// https://github.com/antop-dev/algorithm/issues/803
class P1726 {
    fun tupleSameProduct(nums: IntArray): Int {
        val hash = mutableMapOf<Int, Int>()
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                val v = nums[i] * nums[j]
                hash[v] = (hash[v] ?: 0) + 1
            }
        }
        // 8 × k × (k − 1) / 2 = 4 × k × (k − 1)
        return hash.entries.sumOf { (_, k) -> 4 * k * (k - 1) }
    }
}
