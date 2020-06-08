package com.leetcode

// https://leetcode.com/problems/missing-number/
class P268 {
    fun missingNumber(nums: IntArray): Int {
        nums.sort()

        var n = 0
        var k = 0
        loop@ while (true) {
            while (k < nums.size) {
                if (nums[k] == n) { // find
                    n++
                    continue@loop
                }
                k++
            }
            // can't find
            return n
        }
    }
}
