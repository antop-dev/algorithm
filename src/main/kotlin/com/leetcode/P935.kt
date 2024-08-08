package com.leetcode

// https://github.com/antop-dev/algorithm/issues/574
class P935 {
    private val modulo = 1_000_000_007

    private val graph = mapOf(
        0 to intArrayOf(4, 6),
        1 to intArrayOf(6, 8),
        2 to intArrayOf(7, 9),
        3 to intArrayOf(4, 8),
        4 to intArrayOf(3, 9, 0),
        5 to intArrayOf(),
        6 to intArrayOf(1, 7, 0),
        7 to intArrayOf(2, 6),
        8 to intArrayOf(1, 3),
        9 to intArrayOf(2, 4)
    )

    fun knightDialer(n: Int): Int {
        var dp = IntArray(10) { 1 }
        repeat(n - 1) {
            val newDp = IntArray(10)
            repeat(10) { to ->
                graph[to]?.forEach { from ->
                    newDp[to] = (newDp[to] + dp[from]) % modulo
                }
            }
            dp = newDp
        }

        return dp.reduce { acc, v ->
            (acc + v) % modulo
        }
    }

}
