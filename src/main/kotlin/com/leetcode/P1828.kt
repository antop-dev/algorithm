package com.leetcode

import kotlin.math.sqrt

// https://github.com/antop-dev/algorithm/issues/565
class P1828 {
    fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
        return IntArray(queries.size) { i ->
            val (px, py, r) = queries[i]
            count(px, py, r, points)
        }
    }

    private fun count(qx: Int, qy: Int, r: Int, points: Array<IntArray>): Int {
        return points.count { (px, py) ->
            px in qx - r..qx + r
                    && py in qy - r..qy + r
                    && distance(qx, qy, px, py) <= r
        }
    }

    // 두 점의 거리 구하기
    private fun distance(qx: Int, qy: Int, px: Int, py: Int): Double {
        val xDist = px.toDouble() - qx
        val yDist = py.toDouble() - qy
        return sqrt(xDist * xDist + yDist * yDist)
    }

}
