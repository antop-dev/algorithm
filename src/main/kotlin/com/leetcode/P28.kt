package com.leetcode

// https://leetcode.com/problems/implement-strstr/
class P28 {
    fun strStr(haystack: String, needle: String): Int {
        if (needle == "") return 0
        loop@ for (i in haystack.indices) {
            if (haystack[i] == needle[0]) {
                for (k in 1 until needle.length) {
                    if (i + k >= haystack.length || haystack[i + k] != needle[k]) {
                        continue@loop
                    }
                }
                return i
            }
        }
        return -1
    }
}