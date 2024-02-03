package com.leetcode

// https://github.com/antop-dev/algorithm/issues/245
class P22 {

    fun generateParenthesis(n: Int): List<String> {
        return mutableListOf<String>().apply {
            dfs(this, n, 0, 0, "")
        }
    }

    /**
     * @param open 사용된 열린 괄호 수
     * @param close 사용된 닫힌 괄호 수
     */
    private fun dfs(ans: MutableList<String>, n: Int, open: Int, close: Int, s: String) {
        if (open == n && close == n) { // 열린 괄호 닫힌 괄호 전부 사용됨
            ans += s
            return
        }
        // 위 조건이 만족하지 않다는 것은 열린 괄호나 닫힌 괄호를 추가할 수 있다는 것!
        if (open < n) { // 열린 괄호를 추가할 수 있는 경우
            dfs(ans, n, open + 1, close, "$s(")
        }
        if (close < open) { // 닫힌 괄호를 추가할 수 있는 경우
            dfs(ans, n, open, close + 1, "$s)")
        }
    }

}
