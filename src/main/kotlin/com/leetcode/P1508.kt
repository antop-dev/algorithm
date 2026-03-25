package com.leetcode

// https://github.com/antop-dev/algorithm/issues/729
class P1508 {
    private val modulo = 1_000_000_007

    fun rangeSum(nums: IntArray, n: Int, left: Int, right: Int): Int {
        val sums = IntArray(n * (n + 1) / 2)
        var k = 0
        for (i in 0 until n) {
            var sum = 0
            for (j in i until n) {
                sum += nums[j]
                sums[k++] = sum
            }
        }
        sums.sort()
        return sums
            .slice((left - 1)..<right)
            .fold(0) { acc, v -> (acc + v) % modulo }
    }
}
