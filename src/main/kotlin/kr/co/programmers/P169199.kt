package kr.co.programmers

import java.util.*

// https://github.com/antop-dev/algorithm/issues/504
class P169199 {
    // 북동남서
    private val dy = intArrayOf(-1, 0, 1, 0)
    private val dx = intArrayOf(0, 1, 0, -1)
    fun solution(board: Array<String>): Int {
        val n = board.size
        val m = board[0].length
        // 방문 여부
        val visited = Array(n) { BooleanArray(m) }
        // 출발과 도착 위치 구하기
        val start = IntArray(2)
        val end = IntArray(2)
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == 'R') {
                    start[0] = i
                    start[1] = j
                } else if (board[i][j] == 'G') {
                    end[0] = i
                    end[1] = j
                }
            }
        }
        // BFS
        val queue = LinkedList<IntArray>()
        queue += intArrayOf(start[0], start[1], 0) // [y, x, 이동수]

        while (queue.isNotEmpty()) {
            val p = queue.poll()
            // 도착
            if (p[0] == end[0] && p[1] == end[1]) {
                return p[2]
            }
            // 방문 마킹
            visited[p[0]][p[1]] = true
            // 4방향으로 이동
            dy.zip(dx) { ny, nx ->
                // 현재 위치
                var (y, x, step) = p
                // 한 방향(y + ny, x + nx)으로 갈수 있을 때까지 간다.
                while ( // 다음 위치로 갈 수 있는가?
                    y + ny in 0 until n
                    && x + nx in 0 until m
                    && board[y + ny][x + nx] != 'D'
                ) {
                    // 이동
                    y += ny
                    x += nx
                }
                // 방문하지 않은 곳 체크
                if (!visited[y][x]) {
                    queue += intArrayOf(y, x, step + 1)
                }
            }
        }
        // 완료할 수 없다.
        return -1
    }

}
