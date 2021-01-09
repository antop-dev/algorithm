package com.leetcode

// https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
class P1013 {
    fun canThreePartsEqualSum(arr: IntArray): Boolean {
        val part = arr.sum() / 3
        var count = 0
        var sum = 0
        for (n in arr) {
            sum += n
            if (part == sum) {
                count++
                sum = 0
            }
        }
        return count >= 3
    }
}
