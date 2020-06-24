package com.leetcode

// https://leetcode.com/problems/rotate-string/submissions/
class P796 {
    fun rotateString(A: String, B: String): Boolean {
        if (A.length != B.length) return false
        if (A == "") return true
        with(A.length) {
            search@ for (i in 0 until this) {
                for (j in 0 until this) {
                    if (A[(i + j) % this] != B[j]) continue@search
                }
                return true
            }
            return false
        }
    }
}
