package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/546
class P92344 {
    fun solution(board: Array<IntArray>, skill: Array<IntArray>): Int {
        val cumulativeSum = cumulativeSum(board, skill)
        return countNotDestroyed(board, cumulativeSum)
    }

    private fun cumulativeSum(board: Array<IntArray>, skill: Array<IntArray>): Array<IntArray> {
        val n = board.size
        val m = board[n - 1].size
        val op = Array(n + 1) { IntArray(m + 1) }
        // 마킹
        for ((type, r1, c1, r2, c2, degree) in skill) {
            val v = degree * (if (type == 1) -1 else 1)
            op[r1][c1] += v
            op[r1][c2 + 1] += -v
            op[r2 + 1][c1] += -v
            op[r2 + 1][c2 + 1] += v
        }
        // 가로로 누적 연산합 계산
        for (y in 0 until n) {
            for (x in 1 until m) {
                op[y][x] += op[y][x - 1]
            }
        }
        // 세로로 누적 연산합 계산
        for (x in 0 until m) {
            for (y in 1 until n) {
                op[y][x] += op[y - 1][x]
            }
        }
        return op
    }

    private fun countNotDestroyed(board: Array<IntArray>, cumulativeSum: Array<IntArray>): Int {
        var count = 0
        for (y in board.indices) {
            for (x in board[y].indices) {
                if (board[y][x] + cumulativeSum[y][x] > 0) {
                    count++
                }
            }
        }
        return count
    }

    private operator fun IntArray.component6() = this[5]
}
