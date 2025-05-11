package com.leetcode

// https://github.com/antop-dev/algorithm/issues/651
class P943 {
    fun beautifulArray(n: Int): IntArray {
        val memo = mutableMapOf<Int, IntArray>()
        return f(memo, n)
    }

    private fun f(memo: MutableMap<Int, IntArray>, n: Int): IntArray {
        return memo[n] ?: run {
            val arr = IntArray(n)
            if (n == 1) {
                arr[0] = 1
            } else {
                var i = 0
                for (x in f(memo, (n + 1) / 2)) { // 홀수
                    arr[i++] = (2 * x) - 1
                }
                for (x in f(memo, n / 2)) { // 짝수
                    arr[i++] = 2 * x
                }
            }
            memo[n] = arr
            arr
        }
    }
}