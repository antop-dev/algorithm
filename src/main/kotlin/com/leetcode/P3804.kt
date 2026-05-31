package com.leetcode

// https://github.com/antop-dev/algorithm/issues/751
class P3804 {
    fun centeredSubarrays(nums: IntArray): Int {
        var ans = 0
        for (i in nums.indices) {
            val set = mutableSetOf<Int>()
            var sum = 0
            for (j in i until nums.size) {
                set += nums[j]
                sum += nums[j]
                if (sum in set) {
                    ans++
                }
            }
        }
        return ans
    }
}
