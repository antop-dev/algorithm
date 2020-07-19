package com.leetcode

// https://leetcode.com/problems/reverse-string/
class P344 {
    fun reverseString(s: CharArray) {
        var i = 0
        var k = s.lastIndex
        while (i < k) {
            val tmp = s[i]
            s[i++] = s[k]
            s[k--] = tmp
        }
    }
}
