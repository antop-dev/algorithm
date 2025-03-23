package com.leetcode

import kotlin.math.abs
import kotlin.math.min

// https://github.com/antop-dev/algorithm/issues/639
class P984 {
    fun strWithout3a3b(a: Int, b: Int): String {
        val sb = StringBuilder()
        var diff = abs(a - b)
        val ch = if (a >= b) 'a' else 'b'

        repeat(min(a, b)) {
            if (diff-- > 0) {
                sb.append(if (ch == 'a') "aab" else "bba")
            } else {
                sb.append("ab")
            }
        }
        repeat(diff) { sb.append(ch) }

        return sb.toString()
    }
}
