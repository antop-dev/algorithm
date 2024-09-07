package com.leetcode

// https://github.com/antop-dev/algorithm/issues/580
class P3271 {
    fun stringHash(s: String, k: Int): String {
        val ans = StringBuilder()
        var v = 0
        s.forEachIndexed { i, c ->
            v += c - 'a'
            if ((i + 1) % k == 0) {
                v %= 26
                ans.append((v + 97).toChar())
                v = 0
            }
        }
        return ans.toString()
    }
}
