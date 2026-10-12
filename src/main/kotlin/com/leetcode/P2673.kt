package com.leetcode

import kotlin.math.abs

// https://github.com/antop-dev/algorithm/issues/793
class P2673 {
    fun minIncrements(n: Int, cost: IntArray): Int {
        var ans = 0
        for (i in n - 1 downTo 1 step 2) {
            val r = cost[i]
            val l = cost[i - 1]
            ans += abs(l - r) // 차이만큼 숫자를 증가
            cost[(i - 1) / 2] += maxOf(l, r) // 상위 트리에 더해주기
        }
        return ans
    }
}
