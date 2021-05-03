package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/246
class P451 {

    fun frequencySort(s: String): String {
        val counter = IntArray(128) { 0 }
        val pq = PriorityQueue<Int> { a, b -> counter[b] - counter[a] }

        for (c in s) counter[c.toInt()]++

        for (i in counter.indices) {
            if (counter[i] > 0) pq.add(i)
        }

        val sb = StringBuffer(s.length)
        while (pq.isNotEmpty()) {
            val i = pq.poll()
            while (counter[i]-- > 0) sb.append(i.toChar())
        }
        return sb.toString()
    }

}
