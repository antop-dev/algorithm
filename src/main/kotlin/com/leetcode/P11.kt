package com.leetcode

// https://leetcode.com/problems/container-with-most-water/
class P11 {

    fun maxArea(height: IntArray): Int {
        var i = 0
        var k = height.lastIndex
        var area = 0
        while (i < k) {
            area = maxOf(area, minOf(height[i], height[k]) * (k - i))
            if (height[i] > height[k]) {
                k--
            } else {
                i++
            }
        }
        return area
    }

}
