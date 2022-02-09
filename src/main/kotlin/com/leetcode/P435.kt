package com.leetcode

// https://leetcode.com/problems/non-overlapping-intervals/
class P435 {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        intervals.sortBy { it[0] }
        var count = 0
        var anchor = 0 // 포인터
        for (i in 1 until intervals.size) {
            val x = intervals[anchor]
            val y = intervals[i]
            if (y[0] < x[1]) { // 겹칠 경우
                count++
                if (y[1] < x[1]) { // 포인터는 끝 시간이 짧은 간격을 카리킨다.
                    anchor = i
                }
            } else { // 안겹칠 경우
                anchor = i
            }
        }
        return count
    }
}
