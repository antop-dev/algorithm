package com.leetcode

import java.util.PriorityQueue
import kotlin.text.iterator

// https://github.com/antop-dev/algorithm/issues/533
class P2785 {

    fun sortVowels(s: String): String {
        val ascii = setOf('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')

        val pq = PriorityQueue<Char>()
        for (ch in s) {
            if (ch in ascii) {
                pq += ch
            }
        }

        return buildString {
            for (ch in s) {
                val c = if (ch in ascii) pq.poll() else ch
                this.append(c)
            }
        }
    }
}