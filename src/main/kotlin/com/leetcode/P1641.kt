package com.leetcode

// https://github.com/antop-dev/algorithm/issues/270
class P1641 {
    fun countVowelStrings(n: Int): Int {
        return count(n, 1)
    }

    fun count(n: Int, c: Int): Int {
        if (n == 0) return 1
        return (c..5).sumBy { i -> count(n - 1, i) }
    }
}
