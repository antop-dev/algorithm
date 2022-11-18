package com.leetcode

// https://github.com/antop-dev/algorithm/issues/435
class P2375 {
    fun smallestNumber(pattern: String): String {
        val set = mutableSetOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        return dfs(pattern, set, 0, 0).toString()
    }

    private fun dfs(pattern: String, set: MutableSet<Int>, num: Int, i: Int): Int {
        if (i > pattern.length) return num
        val prev = num % 10
        var min = Int.MAX_VALUE
        for (n in 1..9) {
            if (i > 0) {
                if (!set.contains(n)) continue
                if (pattern[i - 1] == 'I' && n < prev) continue
                if (pattern[i - 1] == 'D' && n > prev) continue
            }

            set -= n
            val v = dfs(pattern, set, (num * 10) + n, i + 1)
            if (v < min) min = v
            set += n // backtracking
        }
        return min
    }
}
