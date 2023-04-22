package com.leetcode

// https://github.com/antop-dev/algorithm/issues/482
class P54 {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val m = matrix.size
        val n = matrix[0].size
        val answer = mutableListOf<Int>()
        // 0:위, 1:오른쪽, 2:아래, 3:왼쪽
        var direction = 1
        var y = 0
        var x = 0

        while (answer.size < m * n) {
            answer += matrix[y][x]
            matrix[y][x] = 999
            // 다음으로 갈 방향
            if (
                (direction == 0 && (y - 1 < 0 || matrix[y - 1][x] == 999))
                || (direction == 1 && (x + 1 >= n || matrix[y][x + 1] == 999))
                || (direction == 2 && (y + 1 >= m || matrix[y + 1][x] == 999))
                || (direction == 3 && (x - 1 < 0 || matrix[y][x - 1] == 999))
            ) {
                direction = (direction + 1) % 4
            }
            // 방향에 따른 다음 좌표
            when (direction) {
                0 -> y--
                1 -> x++
                2 -> y++
                3 -> x--
            }
        }

        return answer
    }
}
