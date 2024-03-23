package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/547
class P12945 {
    fun solution(n: Int): Int {
        val memo = IntArray(n + 1)
        memo[1] = 1
        return f(n, memo)
    }

    private fun f(n: Int, memo: IntArray): Int = when {
        n < 2 -> n
        memo[n] > 0 -> memo[n]
        else -> {
            var v = f(n - 2, memo) + f(n - 1, memo)
            v %= 1234567
            memo[n] = v
            v
        }
    }
}
