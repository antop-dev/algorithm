package com.leetcode

// https://github.com/antop-dev/algorithm/issues/288
class P1689 {
    fun minPartitions(n: String): Int {
        var max = 0
        for (c in n) {
            with(c - '0') {
                if (this > max) max = this
            }
        }
        return max
    }
}
