package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/283
class P853 {

    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val pq = PriorityQueue<Pair<Int, Double>> { o1, o2 -> o2.first - o1.first }
        position.zip(speed) { pos, s ->
            // 목표 지점까지 도달하는데 걸리는 시간
            val time = (target - pos).toDouble() / s
            pq += pos to time
        }

        var ans = 1
        // first = 출발 위치
        // second = 목표 지점까지 도달하는데 걸리는 시간
        var prev = pq.poll()
        while (pq.isNotEmpty()) {
            val cur = pq.poll()
            if (cur.second > prev.second) {
                ans++
                prev = cur
            }
        }
        return ans
    }

}
