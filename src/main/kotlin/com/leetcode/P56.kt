package com.leetcode

// https://github.com/antop-dev/algorithm/issues/307
class P56 {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val answer = mutableListOf<IntArray>()

        // sort by start
        intervals.sortBy { it[0] }

        var anchor = 0
        for (i in 1 until intervals.size) {
            val x = intervals[anchor]
            val y = intervals[i]
            if (x[1] >= y[0]) {
                x[1] = maxOf(x[1], y[1])
            } else {
                answer += x
                anchor = i
            }
        }

        answer += intervals[anchor]

        return answer.toTypedArray()
    }
}
