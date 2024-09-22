package com.leetcode

// https://github.com/antop-dev/algorithm/issues/585
class P826 {
    fun maxProfitAssignment(difficulty: IntArray, profit: IntArray, worker: IntArray): Int {
        val memo = IntArray(100_001)
        difficulty.zip(profit).forEach { (d, p) ->
            // 동일한 난이도에 다른 보상이 여러개 있을 수 있다.
            if (p > memo[d]) {
                memo[d] = p
            }
        }

        var best = 0
        memo.forEachIndexed { i, v ->
            if (v < best) {
                memo[i] = best
            } else {
                best = v
            }
        }

        var ans = 0
        worker.forEach { ans += memo[it] }
        return ans
    }
}
