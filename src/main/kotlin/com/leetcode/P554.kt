package com.leetcode

import kotlin.math.max

// https://github.com/antop-dev/algorithm/issues/640
class P554 {
    fun leastBricks(wall: List<List<Int>>): Int {
        // <벽돌 가로 길이, 개수>
        val hash = mutableMapOf<Int, Int>()

        var count = 0
        for (row in wall) {
            var sum = 0
            for (i in 0 until row.lastIndex) {
                sum += row[i]

                val v = (hash[sum] ?: 0) + 1
                hash[sum] = v
                count = max(count, v)
            }
        }

        return wall.size - count
    }
}
