package com.leetcode

// https://github.com/antop-dev/algorithm/issues/753
class P1023 {
    fun camelMatch(queries: Array<String>, pattern: String): List<Boolean> {
        return queries.map { query -> check(query, pattern) }
    }

    private fun check(query: String, pattern: String): Boolean {
        var i = 0
        for (ch in query) {
            if (i < pattern.length && ch == pattern[i]) {
                i++
            } else if (ch in 'A'..'Z') {
                return false
            }
        }
        return i == pattern.length
    }
}
