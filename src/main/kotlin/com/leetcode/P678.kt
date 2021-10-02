package com.leetcode

// https://github.com/antop-dev/algorithm/issues/319
class P678 {
    fun checkValidString(s: String): Boolean {
        var lo = 0
        var hi = 0
        for (c in s) {
            lo += if (c == '(') 1 else -1
            hi += if (c != ')') 1 else -1
            if (hi < 0) break
            if (lo < 0) lo = 0
        }
        return lo == 0
    }
}
