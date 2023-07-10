package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/497
class P159993 {
    fun solution(maps: Array<String>): Int {
        // 시작 지점, 레버, 출구 위치를 찾는다
        val pos = IntArray(6)
        for (i in maps.indices) {
            for (j in maps[i].indices) {
                when (maps[i][j]) {
                    'S' -> {
                        pos[0] = i
                        pos[1] = j
                    }

                    'L' -> {
                        pos[2] = i
                        pos[3] = j
                    }

                    'E' -> {
                        pos[4] = i
                        pos[5] = j
                    }
                }
            }
        }

        // 시작지점 -> 레버
        val move1 = move(maps, intArrayOf(pos[0], pos[1]), intArrayOf(pos[2], pos[3]))
        if (move1 == -1) return -1
        // 레버 -> 출구
        val move2 = move(maps, intArrayOf(pos[2], pos[3]), intArrayOf(pos[4], pos[5]))
        if (move2 == -1) return -1

        return move1 + move2
    }

    private val dy = intArrayOf(-1, 0, 1, 0)
    private val dx = intArrayOf(0, 1, 0, -1)

    private fun move(maps: Array<String>, start: IntArray, end: IntArray): Int {
        println()
        val n = maps.size
        val m = maps[0].length
        val visited = Array(n) { IntArray(m) }

        val queue = LinkedList<IntArray>()
        queue.add(start)

        var move = 0
        while (queue.isNotEmpty()) {
            // 큐 안에 들어있는 모든 위치를 다 이동해야 한번 움직인 것이다
            val size = queue.size
            repeat(size) {
                val (y, x) = queue.poll()
                // 목적지에 도착
                if (y == end[0] && x == end[1]) return move
                // 4방향으로 이동 예약
                dy.zip(dx) { a, b ->
                    val nextY = y + a
                    val nextX = x + b
                    // 북,동,남,서 방향으로 이동할 수 있는지 체크
                    if (nextY in 0 until n
                        && nextX in 0 until m
                        && visited[nextY][nextX] == 0
                        && maps[nextY][nextX] != 'X'
                    ) { // 이동할 수 있다
                        // 방문 체크를 미리 한다.
                        // 이래야 시간초과가 안난다.
                        visited[nextY][nextX] = 1
                        queue += intArrayOf(nextY, nextX)
                    }
                }
            }

            move++
        }
        return -1
    }
}
