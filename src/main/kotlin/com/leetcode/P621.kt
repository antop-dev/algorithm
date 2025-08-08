package com.leetcode

// https://github.com/antop-dev/algorithm/issues/676
class P621 {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        val counter = IntArray(26)
        var max = 0
        for (task in tasks) {
            val i = task - 'A'
            counter[i]++
            max = maxOf(max, counter[i])
        }
        var ans = (max - 1) * (n + 1)
        for (i in counter.indices) {
            if (counter[i] == max) {
                ans++
            }
        }
        return maxOf(ans, tasks.size)
    }
}