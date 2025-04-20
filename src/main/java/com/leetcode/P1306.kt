package com.leetcode

import java.util.*

// https://github.com/antop-dev/algorithm/issues/648
class P1306 {
    fun canReach(arr: IntArray, start: Int): Boolean {
        // BFS
        val queue = LinkedList<Int>()
        queue += start
        // 탐색한 경로
        val path = mutableSetOf<Int>()
        // 점프 액션
        val action = { pos: Int ->
            if (pos in arr.indices && pos !in path) {
                queue += pos
            }
        }
        // 탐색 시작
        while (queue.isNotEmpty()) {
            val i = queue.poll()
            path += i // 탐색한 경로
            if (arr[i] == 0) { // 0 값으로 이동함
                return true
            }
            val jump = arr[i] // 점프 크기
            action(i - jump) // 왼쪽 점프
            action(i + jump) // 오른쪽 점프
        }
        // 갈 수 없음
        return false
    }
}