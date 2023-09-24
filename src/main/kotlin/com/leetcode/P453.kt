package com.leetcode

// https://github.com/antop-dev/algorithm/issues/511
class P453 {
    fun minMoves(nums: IntArray): Int {
        var min = Int.MAX_VALUE
        for (n in nums) min = minOf(min, n)
        var ans = 0
        for (n in nums) ans += n - min
        return ans
    }
}
