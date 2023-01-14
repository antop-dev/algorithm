package com.leetcode

// https://github.com/antop-dev/algorithm/issues/451
class P1910 {
    fun removeOccurrences(s: String, part: String): String {
        val sb = StringBuilder(s)
        while (sb.contains(part)) {
            val idx = sb.indexOf(part)
            sb.delete(idx, idx + part.length)
        }
        return sb.toString()
    }
}
