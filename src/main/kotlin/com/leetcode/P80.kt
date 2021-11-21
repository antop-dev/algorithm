package com.leetcode

// https://github.com/antop-dev/algorithm/issues/350
class P80 {
    fun removeDuplicates(nums: IntArray): Int {
        val arr = IntArray(nums.size).apply { this[0] = nums[0] }
        var anchor = 0

        var count = 1
        for (i in 1 until nums.size) {
            if (arr[anchor] == nums[i]) {
                if (count >= 2) continue
                count++
            } else {
                count = 1
            }
            arr[++anchor] = nums[i]
        }

        for (i in 1..anchor) nums[i] = arr[i]

        return anchor + 1
    }
}
