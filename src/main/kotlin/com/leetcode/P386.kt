package com.leetcode

// https://github.com/antop-dev/algorithm/issues/550
class P386 {
    fun lexicalOrder(n: Int): List<Int> {
        val ans = mutableListOf<Int>()
        dfs(ans, n, 0)
        return ans
    }

    private fun dfs(ans: MutableList<Int>, limit: Int, n: Int) {
        for (x in 0..9) {
            val v = (n * 10) + x
            if (v == 0) continue
            if (v > limit) break
            ans += v
            dfs(ans, limit, v)
        }
    }
}
