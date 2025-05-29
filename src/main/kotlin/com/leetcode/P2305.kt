package com.leetcode

// https://github.com/antop-dev/algorithm/issues/657
class P2305 {
    fun distributeCookies(cookies: IntArray, k: Int): Int {
        val bags = IntArray(k)
        return dfs(cookies, k, 0, bags)
    }

    private fun dfs(cookies: IntArray, k: Int, pos: Int, bags: IntArray): Int {
        if (pos == cookies.size) {
            return bags.max()
        }

        var min = Int.MAX_VALUE
        for (i in bags.indices) {
            bags[i] += cookies[pos]
            min = minOf(min, dfs(cookies, k, pos + 1, bags))
            bags[i] -= cookies[pos]
        }
        return min
    }
}