package com.leetcode

// https://github.com/antop-dev/algorithm/issues/451
class P1910 {
    fun removeOccurrences(s: String, part: String): String {
        var v = s
        while (v.contains(part)) {
            v = v.replaceFirst(part, "")
        }
        return v
    }
}
