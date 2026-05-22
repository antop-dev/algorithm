package com.leetcode

// https://github.com/antop-dev/algorithm/issues/749
class P1963 {
    fun minSwaps(s: String): Int {
        var open = 0
        var close = 0
        var ans = 0
        var i = 0
        while (open < s.length / 2) {
            if (s[i++] == '[') {
                open++
            } else {
                close++
                if (close > open) {
                    ans++
                    open++
                    close--
                }
            }
        }
        return ans
    }
}
