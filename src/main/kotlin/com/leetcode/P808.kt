package com.leetcode

// https://github.com/antop-dev/algorithm/issues/720
class P808 {
    fun soupServings(n: Int): Double {
        if (n >= 5000) return 1.0
        val memo = mutableMapOf<Pair<Int, Int>, Double>()
        return dfs(memo, n, n)
    }

    private fun dfs(memo: MutableMap<Pair<Int, Int>, Double>, a: Int, b: Int): Double {
        return memo[a to b] ?: run {
            val x = when {
                a <= 0 && b <= 0 -> 0.5
                a <= 0 -> 1.0
                b <= 0 -> 0.0
                else -> {
                    var v = 0.0
                    for ((x, y) in turns) {
                        v += dfs(memo, a - x, b - y)
                    }
                    v * 0.25
                }
            }
            memo[a to b] = x
            x
        }
    }

    private val turns = listOf(
        100 to 0, // pour 100 mL from type A and 0 mL from type B
        75 to 25, // pour 75 mL from type A and 25 mL from type B
        50 to 50, // pour 50 mL from type A and 50 mL from type B
        25 to 75 // pour 25 mL from type A and 75 mL from type B
    )
}
