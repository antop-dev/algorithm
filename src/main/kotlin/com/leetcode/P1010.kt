package com.leetcode

// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
class P1010 {

    fun numPairsDivisibleBy60(time: IntArray): Int {
        val counter = IntArray(60)
        for (t in time) counter[t % 60]++

        var answer = 0
        answer += counter[0] * (counter[0] - 1) / 2
        answer += counter[30] * (counter[30] - 1) / 2
        for (i in 1..29) {
            answer += counter[i] * counter[60 - i]
        }
        return answer
    }

}
