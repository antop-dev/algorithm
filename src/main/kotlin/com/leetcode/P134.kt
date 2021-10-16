package com.leetcode

// https://github.com/antop-dev/algorithm/issues/337
class P134 {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        val n = gas.size
        i@ for (i in gas.indices) {
            var plus = i
            // 시작 지점에서 충전
            var remain = gas[plus]
            // 여행
            for (x in 0 until n) {
                val minus = plus
                // 가스 소모
                if (remain < cost[minus]) continue@i
                remain -= cost[minus]
                // 가스 충전
                plus++
                if (plus >= n) plus = 0
                remain += gas[plus]
            }
            return i
        }
        return -1
    }
}
