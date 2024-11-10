package com.leetcode

// https://github.com/antop-dev/algorithm/issues/600
class P2045 {
    fun partitionString(s: String): Int {
        val set = mutableSetOf<Char>()
        var ans = 1
        for (ch in s) {
            if (ch in set) {
                ans++
                set.clear()
            }
            set += ch
        }
        return ans
    }
}
