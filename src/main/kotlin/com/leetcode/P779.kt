package com.leetcode

import kotlin.math.ceil

// https://leetcode.com/problems/k-th-symbol-in-grammar/
class P779 {
    fun kthGrammar(N: Int, K: Int): Int {
        if (N == 1) return 0
        val prevK = ceil(K / 2.0).toInt()
        val parent = kthGrammar(N - 1, prevK)
        return if (parent == K % 2) 1 else 0
    }
}
