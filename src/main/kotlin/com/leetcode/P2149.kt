package com.leetcode

// https://github.com/antop-dev/algorithm/issues/666
class P2149 {
    fun rearrangeArray(nums: IntArray): IntArray {
        val (positive, negative) = split(nums)
        val ans = IntArray(nums.size)
        for (i in 0 until (nums.size / 2)) {
            val j = i * 2
            ans[j] = positive[i]
            ans[j + 1] = negative[i]
        }
        return ans
    }

    // 양수 음수로 분리
    private fun split(nums: IntArray): Pair<IntArray, IntArray> {
        val positive = IntArray(nums.size / 2)
        val negative = IntArray(nums.size / 2)
        var i = 0
        var j = 0
        for (num in nums) {
            if (num > 0) {
                positive[i++] = num
            } else {
                negative[j++] = num
            }
        }
        return positive to negative
    }
}