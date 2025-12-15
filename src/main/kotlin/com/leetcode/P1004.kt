package com.leetcode

// https://github.com/antop-dev/algorithm/issues/98
class P1004 {
    fun longestOnes(a: IntArray, k: Int): Int {
        var ans = 0
        var zeros = 0
        var i = 0
        for (j in a.indices) {
            if (a[j] == 0) {
                zeros++
            }
            if (zeros > k) {
                if (a[i] == 0) {
                    zeros--
                }
                i++
            }
            ans = maxOf(ans, j - i + 1)
        }
        return ans
    }
}
