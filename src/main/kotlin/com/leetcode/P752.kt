package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/722
class P752 {
    fun openLock(deadends: Array<String>, target: String): Int {
        var ans = Int.MAX_VALUE
        val goal = target.toInt()
        // 방문 여부
        val visited = BooleanArray(10000).apply {
            // 갈 수 없는 노드 == 방문한 노드
            deadends.forEach { this[it.toInt()] = true }
        }
        // 이동 횟수가 적은 순
        val comparator = compareBy<Pair<Int, Int>> { (_, turn) -> turn }
        val pq = PriorityQueue(comparator)
        pq += 0 to 0 // "0000": 0 turns

        while (pq.isNotEmpty()) {
            val (lock, turn) = pq.poll()
            if (visited[lock]) { // 방문한 경우 패스
                continue
            }
            if (turn >= ans) { // 현재 최소 횟수를 넘어가는 경우
                continue
            }
            if (lock == goal) { // 도착하면 끝
                ans = minOf(ans, turn)
                break
            }
            visited[lock] = true
            // 다음으로 움직을 수 있는 번호들 만들기
            val nextLocks = nextLocks(lock)
            nextLocks.forEach { pq += it to turn + 1 }
        }
        return if (ans == Int.MAX_VALUE) -1 else ans
    }

    // 현재 번호에서 갈 수 있는 번호 목록 만들기
    fun nextLocks(lock: Int): List<Int> {
        val locks = mutableListOf<Int>()
        var place = 1 // 자리수
        while (place <= 1000) {
            val digit = (lock / place) % 10
            // +1 (9 -> 0)
            // 1100 -> 1200 = 1100 - 100 + 200 = 1200
            locks += lock - (digit * place) + ((digit + 1) % 10 * place)
            // -1 (0 -> 9)
            // 1000 -> 1900 -> 1000 - 0 + 900 = 1900
            locks += lock - (digit * place) + ((digit + 9) % 10 * place)
            // 1 -> 10 -> 100 -> 1000
            place *= 10
        }
        return locks
    }
}
