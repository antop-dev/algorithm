package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/283
class P853 {

    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        if (position.isEmpty()) return 0
        // 시작지점 : target 까지 도달하는 시간
        val map = TreeMap<Int, Double>() { o1, o2 -> o2 - o1 }
        position.zip(speed) { p, s -> map[p] = (target - p).toDouble() / s }

        var answer = 1
        var prev = map.pollFirstEntry()
        while (map.isNotEmpty()) {
            val cur = map.pollFirstEntry()
            if (cur.value > prev.value) {
                answer++
                prev = cur
            }
        }

        return answer
    }


}
