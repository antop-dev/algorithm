package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/356
class P1094 {
    val max = 1001;

    fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
        val pq = PriorityQueue<IntArray>(trips.size) { a, b ->
            when {
                minOf(a[1], a[2]) < minOf(b[1], b[2]) -> -1
                minOf(a[1], a[2]) > minOf(b[1], b[2]) -> 1
                else -> when {
                    a[2] == b[1] -> -1
                    b[2] == a[1] -> 1
                    else -> 0
                }
            }
        }

        trips.forEach { pq += it }

        var n = 0
        while (pq.isNotEmpty()) {
            val trip = pq.poll();
            if (trip[1] < max) {
                n += trip[0]
                if (n > capacity) {
                    return false
                }
                trip[1] = max
                pq += trip
            } else {
                n -= trip[0]
            }
        }

        return true
    }
}
