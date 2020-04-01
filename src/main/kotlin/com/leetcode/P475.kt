package com.leetcode

import kotlin.math.abs

// https://leetcode.com/problems/heaters/
class P475 {
    fun findRadius(houses: IntArray, heaters: IntArray): Int {
        var radius = 0

        for (i in houses.indices) {
            val find = search(heaters, 0, heaters.lastIndex, houses[i])
            if (find == -1) { // 내 집 위치에 히터가 없다.
                var r = Int.MAX_VALUE
                for (k in heaters.indices) {
                    r = r.coerceAtMost(abs(heaters[k] - houses[i]))
                }
                radius = radius.coerceAtLeast(r)
            }
        }
        return radius
    }

    // 재귀 방식의 이진 탐색
    private fun search(nums: IntArray, s: Int, e: Int, target: Int): Int {
        if (s <= e) {
            val m = (s + e) / 2
            return when {
                target < nums[m] -> search(nums, s, e - 1, target)
                target > nums[m] -> search(nums, s + 1, e, target)
                else -> return m
            }
        }
        return -1;
    }

}