package com.leetcode

// https://github.com/antop-dev/algorithm/issues/57
class P58 {
    fun lengthOfLastWord(s: String): Int {
        var length = 0
        for (i in s.indices.reversed()) {
            if (s[i] == ' ' && length > 0) break
            if (s[i] != ' ') length++
        }
        return length
    }
}
