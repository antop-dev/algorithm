package com.leetcode

// https://github.com/antop-dev/algorithm/issues/83
class P459 {
    fun repeatedSubstringPattern(s: String): Boolean {
        loop@ for (len in s.length / 2 downTo 1) {
            if (s.length % len != 0) continue
            var i = len
            var prev = s.subSequence(0, len)
            while (i < s.length) {
                val w = s.substring(i, i + len)
                if (prev != w) continue@loop
                prev = w
                i += len
            }
            return true
        }
        return false
    }
}
