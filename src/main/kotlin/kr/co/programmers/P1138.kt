package kr.co.programmers

import kotlin.math.abs

// https://leetcode.com/problems/alphabet-board-path/
class P1138 {
    fun alphabetBoardPath(target: String): String {
        var moves = ""
        var p = intArrayOf(0, 0)
        for (s in target) {
            // 아스키 코드의 특성을 이용한다.
            val t = (s - 97).toInt().run { intArrayOf(div(5), rem(5)) }
            // Z에서 다른 곳으로 이동하는 경우라면 미리 위로 한칸 간다.
            if (p[0] == 5 && p[0] - t[0] > 0) {
                moves += 'U'
                p = intArrayOf(p[0] - 1, p[1])
            }
            // 왼쪽 또는 오른쪽으로 이동
            if (t[1] - p[1] != 0) {
                val c = if (t[1] > p[1]) 'R' else 'L'
                repeat(abs(p[1] - t[1])) {
                    moves += c
                }
            }
            // 위 또는 아래로 이동
            if (t[0] - p[0] != 0) {
                val c = if (t[0] > p[0]) 'D' else 'U'
                repeat(abs(p[0] - t[0])) {
                    moves += c
                }
            }
            // adds the character
            moves += "!"
            p = t
        }

        return moves
    }

}
