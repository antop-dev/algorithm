package com.leetcode

// https://github.com/antop-dev/algorithm/issues/508
class P59 {
    // 오른쪽, 아래, 왼쪽, 위
    private val dy = intArrayOf(0, 1, 0, -1)
    private val dx = intArrayOf(1, 0, -1, 0)

    fun generateMatrix(n: Int): Array<IntArray> {
        val box = Array(n) { IntArray(n) }
        var d = 0 // 방향 인덱스
        var y = 0
        var x = 0

        for (i in 0 until n * n) {
            // 숫자 체우기
            box[y][x] = i + 1
            // 다음으로 갈 곳이 좌표를 벗어나거나 이미 갔던 자리일 경우 방향 전환
            if (y + dy[d] !in 0 until n
                || x + dx[d] !in 0 until n
                || box[y + dy[d]][x + dx[d]] != 0
            ) {
                d = (d + 1) % 4
            }
            // 다음 방향으로 이동
            y += dy[d]
            x += dx[d]
        }

        return box
    }

}
