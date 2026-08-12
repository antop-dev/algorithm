package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/775
class P2225 {
    fun findWinners(matches: Array<IntArray>): List<List<Int>> {
        // 플레이어별 패배 횟수를 센다.
        val count = TreeMap<Int, Int>()
        for ((winner, loser) in matches) {
            // count[player] == null : 출전을 안했다.
            // count[player] >= 0 : 출전은 했다.
            if (count[winner] == null) {
                count[winner] = 0
            }
            if (count[loser] == null) {
                count[loser] = 0
            }
            count[loser] = (count[loser] ?: 0) + 1
        }

        for (value in count) {
            println("| ${value.key} | ${value.value} |")
        }

        // 한경기도 패하지 않은 선수, 한 경기만 패한 선수를 뽑아낸다.
        val zero = mutableListOf<Int>()
        val ons = mutableListOf<Int>()
        for ((player, loses) in count) {
            when (loses) {
                0 -> zero += player
                1 -> ons += player
            }
        }
        return listOf(zero, ons)
    }
}
