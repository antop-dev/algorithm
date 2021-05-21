package com.leetcode

// https://github.com/antop-dev/algorithm/issues/265
class P1638 {
    fun countSubstrings(s: String, t: String): Int {
        var answer = 0
        for (i in 0 until minOf(s.length, t.length)) {
            for (j in 0 until s.length - i) {
                val S = s.substring(j, j + i + 1)
                for (k in 0 until t.length - i) {
                    val T = t.substring(k, k + i + 1)
                    if (compare(S, T)) answer++
                }
            }
        }
        return answer
    }

    private fun compare(s: String, t: String): Boolean {
        var c = 0
        for (i in s.indices) {
            if (s[i] != t[i]) {
                c++
                if (c > 1) return false
            }
        }
        return c == 1
    }

}
