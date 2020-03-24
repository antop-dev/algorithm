package com.leetcode

import kotlin.math.max

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
class P84 {
    fun largestRectangleArea(heights: IntArray): Int {
        var max = 0
        // 체크해야 하는 높이를 뽑아낸다
        val set = heights.toSet()

        // 해당 높이를 가지는 연속된 바(cal)의 최대 길이(maxCol)를 구한다.
        for (n in set) {
            var maxCol = 0
            var col = 0

            for (i in heights.indices) {
                if (n <= heights[i]) {
                    col++
                } else {
                    maxCol = max(maxCol, col)
                    col = 0
                }
            }

            maxCol = max(maxCol, col)
            max = max(max, n * maxCol)
        }
        return max
    }
}