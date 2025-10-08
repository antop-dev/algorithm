package com.leetcode

// https://github.com/antop-dev/algorithm/issues/690
class P838 {
    fun pushDominoes(dominoes: String): String {
        val n = dominoes.length
        val ans = dominoes.toCharArray()
        var anchor = 0
        for (i in 0 until n) {
            if (dominoes[i] == 'R') {
                if (dominoes[anchor] == 'R') { // R.R.L -> RRR.L
                    fillChar(ans, anchor, i - 1, 'R')
                }
                anchor = i
            } else if (dominoes[i] == 'L') {
                if (dominoes[anchor] != 'R') { // ..L  -> LLL
                    fillChar(ans, anchor, i, 'L')
                } else if (dominoes[anchor] == 'R') { // R
                    // R..L  -> RRLL
                    // R...L -> RR.LL
                    fillHalf(ans, anchor, i)
                }
                anchor = i
            }
        }
        // LR... -> LRRRR
        if (anchor < n && dominoes[anchor] == 'R') {
            fillChar(ans, anchor, n - 1, 'R')
        }

        return ans.joinToString("")
    }

    private fun fillHalf(array: CharArray, from: Int, to: Int) {
        val mid = (from + to) / 2
        fillChar(array, from, mid, 'R')
        fillChar(array, mid + 1, to, 'L')
        if ((to - from - 1) % 2 == 1) {
            array[mid] = '.'
        }
    }

    private fun fillChar(array: CharArray, from: Int, to: Int, ch: Char) {
        for (i in from..to) {
            array[i] = ch
        }
    }
}