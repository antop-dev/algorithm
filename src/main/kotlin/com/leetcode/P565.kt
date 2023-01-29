package com.leetcode

// https://github.com/antop-dev/algorithm/issues/460
class P565 {
    fun arrayNesting(nums: IntArray): Int {
        var longest = 1
        val map = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            var count = 0
            var k = i
            while (!map.containsKey(k)) {
                count++
                map[k] = nums[k]
                k = nums[k]
            }
            longest = maxOf(longest, count)
        }
        return longest
    }

}
