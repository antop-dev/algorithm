package com.leetcode

// https://github.com/antop-dev/algorithm/issues/393
class P260 {
    fun singleNumber(nums: IntArray): IntArray {
        if (nums.size == 2) return nums

        var res = nums[0]
        for (i in 1 until nums.size) {
            res = res xor nums[i]
        }

        val count = res and res.inv() + 1 //right significant bit
        var x = 0
        var y = 0

        for (n in nums) {
            if (n and count == 0) {
                x = x xor res xor n
            } else {
                y = y xor res xor n
            }
        }

        return intArrayOf(x, y)
    }
}
