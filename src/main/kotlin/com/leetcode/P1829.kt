package com.leetcode

// https://github.com/antop-dev/algorithm/issues/615
class P1829 {
    fun getMaximumXor(nums: IntArray, maximumBit: Int): IntArray {
        val n = nums.size
        var acc = 0
        val k = (1 shl maximumBit) - 1

        val ans = IntArray(n)
        for (i in nums.indices) {
            acc = acc xor nums[i]
            ans[n - i - 1] = k xor acc
        }
        return ans
    }
}
