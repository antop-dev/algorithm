package com.leetcode

// https://github.com/antop-dev/algorithm/issues/709
class P481 {
    fun magicalString(n: Int): Int {
        val sb = StringBuilder("122")
        var ch = '1'
        for (i in 2..n) {
            val count = sb[i] - '0'
            repeat(count) { sb.append(ch) }
            ch = if (ch == '1') '2' else '1'
        }
        return sb.take(n).count { it == '1' }
    }
}