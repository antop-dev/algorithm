package com.leetcode

// https://leetcode.com/problems/combination-sum/
class P39 {
    private val combinations = mutableListOf<List<Int>>()

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val pool = mutableListOf<Int>()
        dfs(candidates, 0, target, pool)
        return combinations
    }

    private fun dfs(candidates: IntArray, i: Int, target: Int, pool: MutableList<Int>) {
        if (target < 0) return
        if (target == 0) {
            combinations += pool.toList()
            return
        }

        var k = i
        while (k < candidates.size) {
            val n = candidates[k]
            pool += n
            dfs(candidates, k, target - n, pool)
            k++
            pool.removeAt(pool.lastIndex)
        }
    }

}
