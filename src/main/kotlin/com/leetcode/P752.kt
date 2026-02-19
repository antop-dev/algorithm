package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/722
class P752 {
    fun openLock(deadends: Array<String>, target: String): Int {
        val goal = target.toInt()
        // 방문 여부
        val visited = BooleanArray(10000).apply {
            // 갈 수 없는 노드 == 방문한 노드
            deadends.forEach { this[it.toInt()] = true }
        }
        // 이동 횟수
        var turns = 0

        val queue = LinkedList<Int>()
        queue += 0

        while (queue.isNotEmpty()) {
            var loop = queue.size
            while (loop-- > 0) {
                val lock = queue.poll()
                if (visited[lock]) {
                    continue
                }
                if (lock == goal) {
                    return turns
                }
                visited[lock] = true
                // 다음으로 움직을 수 있는 번호들 만들기
                val nextLocks = nextLocks(lock)
                nextLocks.forEach {
                    if (!visited[it]) {
                        queue += it
                    }
                }
            }
            turns++
        }
        return -1
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
