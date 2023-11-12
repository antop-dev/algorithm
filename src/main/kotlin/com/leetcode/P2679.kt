package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/520
class P2679 {
    fun matrixSum(nums: Array<IntArray>): Int {
        val m = nums[0].size
        // int array -> priority queue
        val pqs = nums.map { arr ->
            PriorityQueue<Int>(m).apply {
                arr.forEach { this += -it }
            }
        }
        var finalScore = 0
        repeat(m) {
            var min = 1
            for (pq in pqs) {
                min = minOf(min, pq.poll())
            }
            finalScore += -min
        }
        return finalScore
    }
}
