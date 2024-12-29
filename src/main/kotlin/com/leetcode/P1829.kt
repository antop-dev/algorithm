package com.leetcode

import kotlin.math.pow

// https://github.com/antop-dev/algorithm/issues/615
class P1829 {
    fun getMaximumXor(nums: IntArray, maximumBit: Int): IntArray {
        var cumulative = nums.fold(0) { acc, n -> acc xor n }
        val k = 2.0.pow(maximumBit).toInt() - 1

        val ans = IntArray(nums.size)
        for (i in nums.indices) {
            ans[i] = k xor cumulative
            cumulative = cumulative xor nums[nums.lastIndex - i]
        }
        return ans
    }
}
