package com.leetcode

// https://github.com/antop-dev/algorithm/issues/420
class P151 {
    fun reverseWords(s: String): String {
        return s.split(" ")
            .filter { it != "" }
            .reversed()
            .joinToString(" ")
    }
}
