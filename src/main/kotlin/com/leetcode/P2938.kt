package com.leetcode

// https://github.com/antop-dev/algorithm/issues/705
class P2938 {
    fun minimumSteps(s: String): Long {
        var ans = 0L
        var j = 0
        for (i in s.indices) {
            if (s[i] == '0') {
                ans += i - j
                j++
            }
        }
        return ans
    }
}