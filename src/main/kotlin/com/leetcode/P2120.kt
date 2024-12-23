package com.leetcode

// https://github.com/antop-dev/algorithm/issues/612
class P2120 {
    fun executeInstructions(n: Int, startPos: IntArray, s: String): IntArray {
        return IntArray(s.length) { i -> move(n, startPos, s, i) }
    }

    private fun move(n: Int, startPos: IntArray, s: String, i: Int): Int {
        var move = 0
        val pos = intArrayOf(startPos[0], startPos[1])
        for (k in i until s.length) {
            when (s[k]) {
                'U' -> pos[0]--
                'R' -> pos[1]++
                'D' -> pos[0]++
                'L' -> pos[1]--
            }
            if (pos[0] !in 0 until n || pos[1] !in 0 until n) {
                break
            }
            move++
        }
        return move
    }
}
