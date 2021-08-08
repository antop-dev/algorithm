package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/309
class P215 {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val queue = PriorityQueue<Int> { o1, o2 -> o2 - o1 }
        for (n in nums) queue.add(n)
        repeat(k - 1) { queue.poll() }
        return queue.peek()
    }
}
