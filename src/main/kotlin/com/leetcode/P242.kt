package com.leetcode

// https://github.com/antop-dev/algorithm/issues/135
class P242 {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val arr = IntArray(26)
        for (i in s.indices) {
            arr[s[i] - 'a']++
            arr[t[i] - 'a']--
        }

        for (i in arr.indices) {
            if (arr[i] != 0) return false
        }
        return true
    }
}
