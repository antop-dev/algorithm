package com.leetcode

// https://github.com/antop-dev/algorithm/issues/359
class P40 {

    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val counter = candidates.toList()
            .groupingBy { it }.eachCount()
            .map { intArrayOf(it.key, it.value) }
        val answer = mutableListOf<List<Int>>()
        backtrack(mutableListOf(), target, 0, counter, answer)
        return answer
    }

    private fun backtrack(
        pool: MutableList<Int>,
        remain: Int,
        cursor: Int,
        counter: List<IntArray>,
        answer: MutableList<List<Int>>
    ) {
        if (remain <= 0) {
            if (remain == 0) answer += pool.toList()

            return
        }

        for (i in cursor until counter.size) {
            val candidate = counter[i][0]
            val c = counter[i][1]
            if (c <= 0) continue

            pool += candidate
            counter[i][1]--

            backtrack(pool, remain - candidate, i, counter, answer)

            counter[i][1]++
            pool.removeAt(pool.lastIndex)
        }
    }

}
