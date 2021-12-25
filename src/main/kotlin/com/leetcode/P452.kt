package com.leetcode

// https://github.com/antop-dev/algorithm/issues/360
class P452 {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        points.sortBy { it[1] }

        var answer = 1
        var arrow = points[0][1]

        for (i in 1 until points.size) {
            val p = points[i]
            if (p[0] > arrow) {
                arrow = p[1]
                answer++
            }
        }
        return answer
    }
}
