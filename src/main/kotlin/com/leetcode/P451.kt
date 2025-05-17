package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/246
class P451 {

    fun frequencySort(s: String): String {
        // 문자 수 카운팅
        val counter = IntArray(128)
        s.forEach { ch -> counter[ch.code]++ }
        // 우선순위 큐에 카운팅이 있는 문자열의 인덱스만 넣는다.
        val pq = PriorityQueue<Int> { a, b -> counter[b] - counter[a] }
        counter.forEachIndexed { i, v ->
            if (v > 0) {
                pq += i
            }
        }
        // 우선순위큐에서 꺼내면서 문자열 완성
        return buildString {
            while (pq.isNotEmpty()) {
                val i = pq.poll()
                while (counter[i]-- > 0) {
                    append(i.toChar())
                }
            }
        }
    }

}
