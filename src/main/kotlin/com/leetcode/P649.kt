package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/579
class P649 {
    fun predictPartyVictory(senate: String): String {
        val n = senate.length
        val rq = LinkedList<Int>()
        val dq = LinkedList<Int>()
        senate.forEachIndexed { i, c ->
            when (c) {
                'R' -> rq += i
                'D' -> dq += i
            }
        }
        while (rq.isNotEmpty() && dq.isNotEmpty()) {
            val i = minOf(rq.peek(), dq.peek())
            if (i == rq.peek()) {
                dq.poll()
                rq += rq.poll() + n
            } else if (i == dq.peek()) {
                rq.poll()
                dq += dq.poll() + n
            }
        }
        return if (rq.size > dq.size) "Radiant" else "Dire"
    }
}
