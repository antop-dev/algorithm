package com.leetcode

// https://github.com/antop-dev/algorithm/issues/245
class P22 {
    val answer = mutableListOf<String>()

    fun generateParenthesis(n: Int): List<String> {
        f(n, 1, 0, "(")
        return answer
    }

    private fun f(n: Int, open: Int, close: Int, s: String) {
        println("n = $n, open = $open, close = $close, s = $s")
        if (open == n && close == n) {
            answer += s
            return
        }

        if (open < n) f(n, open + 1, close, "$s(")
        if (close < open) f(n, open, close + 1, "$s)")
    }

}
