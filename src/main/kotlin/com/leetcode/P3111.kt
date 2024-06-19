package com.leetcode

// https://github.com/antop-dev/algorithm/issues/564
class P3111 {
    fun minRectanglesToCoverPoints(points: Array<IntArray>, w: Int): Int {
        points.sortBy { it[0] }
        var count = 1
        var anchor = 0
        for (i in points.indices) {
            if (points[i][0] - points[anchor][0] > w) {
                count++
                anchor = i
            }
        }
        return count
    }
}
