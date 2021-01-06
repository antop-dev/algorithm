package com.leetcode

import java.util.*
import kotlin.math.abs

// https://leetcode.com/problems/last-stone-weight/
class P1046 {
    fun lastStoneWeight(stones: IntArray): Int {
        val queue: PriorityQueue<Int> = PriorityQueue(stones.size) { x, y -> y - x }
        queue.addAll(stones.toList())

        while (queue.size > 1) {
            val x = queue.poll()
            val y = queue.poll()
            queue.add(abs(x - y))
        }
        return queue.poll()
    }
}
