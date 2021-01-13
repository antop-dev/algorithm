package com.leetcode

// https://leetcode.com/problems/count-of-matches-in-tournament/
class P1688 {
    fun numberOfMatches(n: Int): Int {
        var matches = 0
        var teams = n
        while (teams > 1) {
            val odd = teams % 2 == 1
            matches += teams / 2
            teams /= 2
            if (odd) teams++
        }
        return matches
    }
}
