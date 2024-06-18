package com.leetcode

// https://github.com/antop-dev/algorithm/issues/564
class P3111 {
    fun minRectanglesToCoverPoints(points: Array<IntArray>, w: Int): Int {
        val x = points.map { (x, _) -> x }.distinct().sorted()
        var count = 1
        var anchor = 0
        for (i in x.indices) {
            if (x[i] - x[anchor] > w) {
                count++
                anchor = i
            }
        }
        return count
    }
}
