package com.leetcode

import kotlin.math.abs

// https://github.com/antop-dev/algorithm/issues/744
class P3868 {
    fun minCost(nums1: IntArray, nums2: IntArray): Int {
        // nums의 갯수
        val map = mutableMapOf<Int, Int>()
        // nums1의 갯수는 양수로 nums2의 갯수는 음수로 센다.
        nums1.zip(nums2) { num1, num2 ->
            map[num1] = (map[num1] ?: 0) + 1
            map[num2] = (map[num2] ?: 0) - 1
        }
        var ans = 0
        for ((_, count) in map) {
            if (count % 2 != 0) {
                return -1
            }
            // nums1 → nums2(or nums2 ← nums1)로 옮기는 회수
            ans += abs(count) / 2
        }
        // A와 B가 서로 교환하는 회수
        return ans / 2
    }
}
