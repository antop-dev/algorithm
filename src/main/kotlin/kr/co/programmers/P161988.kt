package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/531
class P161988 {

    fun solution(sequence: IntArray): Long {
        val pulse1 = max(sequence, 1) // [1, -1, 1, ...]
        val pulse2 = max(sequence, -1) // [-1, 1, -1, ...]
        return maxOf(pulse1, pulse2)
    }

    private fun max(sequence: IntArray, start: Int): Long {
        val n = sequence.size
        val dp = LongArray(n)
        var sign = start
        for (i in 0 until n) {
            dp[i] = sequence[i] * sign * 1L
            sign *= -1
        }
        var max = dp[0]
        for (i in 1 until n) {
            // dp[n] = n번째 원소를 포함했을 때의 최대값
            dp[i] = maxOf(dp[i - 1] + dp[i], dp[i])
            max = maxOf(max, dp[i])
        }
        return max
    }

}
