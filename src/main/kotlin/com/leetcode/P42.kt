package com.leetcode

// https://github.com/antop-dev/algorithm/issues/317
class P42 {
    fun trap(height: IntArray): Int {
        var water = 0

        var l = 0
        var r = height.lastIndex
        var prevHeight = 0
        while (l < r) {
            val h = minOf(height[l], height[r])
            if (h > prevHeight) {
                for (i in l + 1 until r) {
                    if (height[i] < h) {
                        water += h - height[i]
                        height[i] = h
                    }
                }
                prevHeight = h
            }

            if (height[l] < height[r]) {
                l++
            } else if (height[l] > height[r]) {
                r--
            } else {
                l++
                r--
            }
        }

        return water
    }
}
