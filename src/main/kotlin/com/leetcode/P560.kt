package com.leetcode

// https://github.com/antop-dev/algorithm/issues/406
class P560 {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var sum = 0
        val map = mutableMapOf<Int, Int>().apply {
            this[0] = 1
        }

        for (n in nums) {
            println("n = $n, map = $map")
            sum += n
            println("  sum = $sum")
            map[sum - k]?.run { count += this }
            map[sum] = (map[sum] ?: 0) + 1
            println("  map = $map")
            println("  count = $count")
        }

        return count
    }
}
