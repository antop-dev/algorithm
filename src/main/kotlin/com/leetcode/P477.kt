package com.leetcode

// https://github.com/antop-dev/algorithm/issues/353
class P477 {
    fun totalHammingDistance(nums: IntArray): Int {
        var total = 0
        for (i in 0 until 31) {
            var zero = 0
            var one = 0
            for (n in nums) {
                if (n.shr(i).and(1) == 0) {
                    zero++
                } else {
                    one++
                }
            }
            total += zero * one
        }
        return total
    }
}
