package com.leetcode

// https://github.com/antop-dev/algorithm/issues/57
class P58 {
    fun lengthOfLastWord(s: String): Int {
        var c = 0
        for (i in s.lastIndex downTo 0) {
            if (s[i] == ' ' && c > 0) break
            else if (s[i] != ' ') c++
        }
        return c
    }
}