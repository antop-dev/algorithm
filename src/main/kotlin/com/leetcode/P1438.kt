package com.leetcode

import java.util.TreeMap

// https://github.com/antop-dev/algorithm/issues/783
class P1438 {
    fun longestSubarray(nums: IntArray, limit: Int): Int {
        val map = TreeMap<Int, Int>()
        var ans = 1
        // 슬라이딩 윈도우
        var l = 0
        for (r in nums.indices) {
            map[nums[r]] = (map[nums[r]] ?: 0) + 1
            while (map.lastKey() - map.firstKey() > limit) {
                val minus = (map[nums[l]] ?: 0) - 1
                if (minus <= 0) {
                    map -= nums[l]
                } else {
                    map[nums[l]] = minus
                }
                l++
            }
            ans = maxOf(ans, r - l + 1)
        }
        return ans
    }
}
