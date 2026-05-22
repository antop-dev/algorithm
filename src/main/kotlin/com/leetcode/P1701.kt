package com.leetcode

// https://github.com/antop-dev/algorithm/issues/748
class P1701 {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        val n = customers.size
        var total = 0L
        var idle = 0
        for (i in customers.indices) {
            val (arrival, time) = customers[i]
            val wait = time + (if (arrival < idle) {
                idle - arrival // 기다려야 함
            } else {
                0 // 바로 요리 시작
            })
            total += wait
            idle = arrival + wait
        }
        return total / n.toDouble()
    }
}
