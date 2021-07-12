package com.leetcode

// https://github.com/antop-dev/algorithm/issues/297
class P131 {
    fun partition(s: String): List<List<String>> {
        // dynamic programming
        val dp = Array(s.length) { IntArray(s.length) }.apply {
            for (i in s.indices) this[i][i] = 1
            for (i in 1 until s.length) {
                if (s[i - 1] == s[i]) {
                    this[i - 1][i] = 1
                }
            }

            for (start in 2 until s.length) {
                var i = 0
                var j = start
                while (j < s.length) {
                    if (s[i] == s[j] && this[i + 1][j - 1] == 1) {
                        this[i][j] = 1
                    }
                    i++
                    j++
                }
            }
        }

        // backtracking
        val answer = mutableListOf<List<String>>()
        val pool = mutableListOf<String>()
        dfs(dp, answer, pool, s, 0)
        return answer
    }

    private fun dfs(
        dp: Array<IntArray>,
        answer: MutableList<List<String>>,
        pool: MutableList<String>,
        s: String,
        p: Int
    ) {
        if (p == s.length) {
            answer += pool.toList()
            return
        }
        for (i in p until s.length) {
            if (dp[p][i] == 1) {
                pool.add(s.substring(p, i + 1))
                dfs(dp, answer, pool, s, i + 1)
                pool.removeAt(pool.lastIndex)
            }
        }
    }
}
