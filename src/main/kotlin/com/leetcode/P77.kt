package com.leetcode

// https://github.com/antop-dev/algorithm/issues/320
class P77 {
    fun combine(n: Int, k: Int): List<List<Int>> {
        val combined = mutableListOf<List<Int>>()
        r(combined, mutableListOf(), n, k, 0)
        return combined
    }

    private fun r(
        combined: MutableList<List<Int>>, pool: MutableList<Int>,
        n: Int, k: Int, m: Int
    ) {
        if (pool.size == k) {
            combined += pool.toList() // copy
            return
        }

        for (j in m + 1..n) {
            pool.add(j)
            r(combined, pool, n, k, j)
            pool.removeAt(pool.lastIndex)
        }
    }
}
