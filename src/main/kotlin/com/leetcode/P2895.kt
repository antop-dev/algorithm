package com.leetcode

// https://github.com/antop-dev/algorithm/issues/757
class P2895 {
    fun minProcessingTime(processorTime: List<Int>, tasks: List<Int>): Int {
        val pt = processorTime.sorted()
        val t = tasks.sortedDescending()
        println(pt)
        println(t)
        var ans = 0
        for (i in pt.indices) {
            val time = pt[i] + t[i * 4]
            ans = maxOf(ans, time)
        }
        return ans
    }
}
