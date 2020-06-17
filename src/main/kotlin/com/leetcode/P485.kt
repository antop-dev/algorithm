package com.leetcode

import kotlin.math.max

class P485 {

    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var max = 0
        var c = 0
        for (n in nums) {
            if (n == 1) {
                c++
            } else {
                max = max(max, c)
                c = 0
            }
        }
        return max(max, c)
    }

}
