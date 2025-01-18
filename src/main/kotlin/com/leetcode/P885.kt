package com.leetcode

// https://github.com/antop-dev/algorithm/issues/621
class P885 {
    fun spiralMatrixIII(rows: Int, cols: Int, rStart: Int, cStart: Int): Array<IntArray> {
        val n = rows * cols
        val ans = mutableListOf<IntArray>()
        ans += intArrayOf(rStart, cStart)

        var step = 0
        var r = rStart
        var c = cStart

        val move = { action: () -> Unit ->
            repeat(step) {
                action()
                // check
                if (r in 0 until rows && c in 0 until cols) {
                    ans += intArrayOf(r, c)
                }
            }
        }

        while (ans.size < n) {
            step++
            move { c++ } // →
            move { r++ } // ↓
            step++
            move { c-- } // ←
            move { r-- } // ↑
        }

        return ans.toTypedArray()
    }

}
