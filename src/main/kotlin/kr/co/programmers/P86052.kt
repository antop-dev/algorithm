package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/409
class P86052 {

    companion object {
        const val UP = 0
        const val RIGHT = 1
        const val DOWN = 2
        const val LEFT = 3
    }

    fun solution(grid: Array<String>): IntArray {
        // 각 격자에서 네방향으로 이동한 기록
        val memo = Array(grid.size) {
            Array(grid[0].length) {
                intArrayOf(0, 0, 0, 0)
            }
        }

        val steps = mutableListOf<Int>()

        for (i in memo.indices) {
            for (j in memo[i].indices) {
                for (k in 0 until 4) { // 4방향으로 빛을 쏜다.
                    var y = i
                    var x = j
                    var d = k
                    var step = 0

                    while (memo[y][x][d] == 0) {
                        memo[y][x][d] = 1
                        step++
                        // 다음 격자로 이동 했다.
                        y += when (d) {
                            UP -> -1
                            DOWN -> 1
                            else -> 0
                        }
                        if (y < 0) y = memo.lastIndex
                        if (y > memo.lastIndex) y = 0

                        x += when (d) {
                            RIGHT -> 1
                            LEFT -> -1
                            else -> 0
                        }
                        if (x < 0) x = memo[0].lastIndex
                        if (x > memo[0].lastIndex) x = 0
                        // 이동한 격자에서 이동할 방향을 구한다.
                        when (grid[y][x]) {
                            'L' -> {
                                d--
                                if (d < 0) d = LEFT
                            }
                            'R' -> {
                                d++
                                if (d > 3) d = UP
                            }
                        }
                    }

                    if (step > 0) steps += step
                }
            }
        }

        return steps.sorted().toIntArray()
    }

}
