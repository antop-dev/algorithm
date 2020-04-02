package com.leetcode

// https://leetcode.com/problems/is-subsequence/
class P392 {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true

        val sc = s.toCharArray()
        val tc = t.toCharArray()
        var i = 0
        var k = 0
        while (i < tc.size) {
            println("s[$k] (${sc[k]}) == t[$i] (${tc[i]})")
            if (sc[k] == tc[i]) k++
            if (k == sc.size) return true
            i++
        }
        return false
    }
}