package com.leetcode

// https://github.com/antop-dev/algorithm/issues/604
class P2161 {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val left = mutableListOf<Int>()
        val center = mutableListOf<Int>()
        val right = mutableListOf<Int>()

        for (n in nums) {
            if (n < pivot) {
                left += n
            } else if (n > pivot) {
                right += n
            } else {
                center += n
            }
        }

        val ans = mutableListOf<Int>()
        ans += left
        ans += center
        ans += right

        return ans.toIntArray()
    }
}
