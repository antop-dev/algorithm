package com.leetcode

// https://github.com/antop-dev/algorithm/issues/32
class P1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val v = target - nums[i]
            if (map.containsKey(v)) {
                return intArrayOf(i, map[v]!!)
            }
            map[nums[i]] = i
        }

        return intArrayOf()
    }
}
