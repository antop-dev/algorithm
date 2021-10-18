package com.leetcode

// https://github.com/antop-dev/algorithm/issues/339
class P1395 {
    fun numTeams(rating: IntArray): Int {
        var answer = 0

        val n = rating.size
        val greater = IntArray(n)
        val lesser = IntArray(n)

        for (i in rating.indices) {
            for (j in i downTo 0) {
                if (rating[i] > rating[j]) {
                    greater[i]++
                    answer += greater[j]
                }
                if (rating[i] < rating[j]) {
                    lesser[i]++
                    answer += lesser[j]
                }
            }
        }

        return answer
    }
}
