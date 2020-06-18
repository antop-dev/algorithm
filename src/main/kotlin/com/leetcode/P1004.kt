package com.leetcode

// https://leetcode.com/problems/max-consecutive-ones-iii/
class P1004 {
    fun longestOnes(A: IntArray, K: Int): Int {
        var result = 0
        var zeros = 0
        var i = 0 // first pointer
        A.forEachIndexed { j, num -> // second pointer
            if (num == 0) zeros++
            if (zeros > K) {
                if (A[i] == 0) zeros--
                i++
            }
            result = maxOf(result, j - i + 1)
        }
        return result
    }
}
