package com.leetcode

// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
class P1010 {

    fun numPairsDivisibleBy60(time: IntArray): Int {
        val counter = IntArray(60)
        for (t in time) counter[t % 60]++

        var answer = 0
        answer += nCr(counter[0])
        answer += nCr(counter[30])
        for (i in 1 until counter.size / 2) {
            answer += counter[i] * counter[60 - i]
        }
        return answer
    }

    // n개 중 r개를 고르는 경우 조합의 수 구하기
    private fun nCr(n: Int, r: Int = 2): Int {
        var pick = r // 이놈의 코틀린 final...

        if (pick > n) return 0
        if (pick == 0) return 1
        if (n == pick) return 1
        if (n - pick < pick) pick = n - pick

        var res = 1
        for (i in 1..pick) res = res * (n - i + 1) / i
        return res
    }

}
