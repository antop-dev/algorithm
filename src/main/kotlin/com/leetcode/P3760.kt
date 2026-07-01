package com.leetcode

// https://github.com/antop-dev/algorithm/issues/759
class P3760 {
    fun maxDistinct(s: String): Int {
        val set = mutableSetOf<Char>()
        for (ch in s) {
            set += ch
        }
        return set.size
    }
}
