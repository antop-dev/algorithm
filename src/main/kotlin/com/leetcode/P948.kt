package com.leetcode

// https://github.com/antop-dev/algorithm/issues/602
class P948 {
    fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
        tokens.sort()
        var score = 0
        var p = power
        var i = 0
        var j = tokens.lastIndex
        while (i <= j) {
            if (tokens[i] <= p) {
                score++
                p -= tokens[i++]
            } else if (tokens[j] > p && score > 0 && i < j) {
                score--
                p += tokens[j--]
            } else {
                break
            }
        }
        return score
    }
}
