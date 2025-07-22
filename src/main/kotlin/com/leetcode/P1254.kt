package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/669
class P1254 {
    fun findTheWinner(n: Int, k: Int): Int {
        val queue = LinkedList<Int>()
        (1..n).forEach { queue += it }

        while (queue.size > 1) {
            repeat(k - 1) { // count friends
                queue += queue.poll()
            }
            queue.poll() // leaves
        }
        return queue.poll()
    }
}