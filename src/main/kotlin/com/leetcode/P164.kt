package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/518
class P164 {
    fun maximumGap(nums: IntArray): Int {
        val pq = PriorityQueue<Int>()
        for (n in nums) pq += n
        var gap = 0
        while (pq.size > 1) {
            val n = pq.poll()
            val diff = pq.peek() - n
            if (diff > gap) gap = diff
        }
        return gap
    }
}
