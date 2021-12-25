package com.leetcode

// https://github.com/antop-dev/algorithm/issues/360
class P452 {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        points.sortBy { it[0] }

        var answer = 1
        var standard = points[0][1]

        for (p in points) {
            standard = if (standard >= p[0]) {
                minOf(p[1], standard)
            } else {
                answer++
                p[1]
            }
        }
        return answer
    }
}
