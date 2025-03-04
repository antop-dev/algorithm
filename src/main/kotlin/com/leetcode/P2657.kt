package com.leetcode

// https://github.com/antop-dev/algorithm/issues/632
class P2657 {
    fun findThePrefixCommonArray(A: IntArray, B: IntArray): IntArray {
        val n = A.size
        var a = 0L
        var b = 0L
        val ans = IntArray(n)
        for (i in 0 until n) {
            a = a or (1L shl A[i])
            b = b or (1L shl B[i])
            ans[i] = (a and b).countOneBits()
        }
        return ans
    }
}
