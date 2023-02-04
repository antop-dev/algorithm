package com.leetcode

// https://github.com/antop-dev/algorithm/issues/98
class P1004 {
    fun longestOnes(A: IntArray, K: Int): Int {
        var result = 0
        var zeros = 0 // count of zero
        var i = 0 // first pointer
        var j = 0 // second pointer
        for (j in A.indices) {
            val num = A[j]
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
