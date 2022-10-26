package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/427
class P1642 {
    fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
        var brick = bricks
        val pq = PriorityQueue<Int>()
        for (i in 0 until heights.lastIndex) {
            val diff = heights[i + 1] - heights[i]
            if (diff > 0) pq.add(diff)
            if (pq.size > ladders) brick -= pq.poll()
            if (brick < 0) return i
        }
        return heights.lastIndex
    }
}
