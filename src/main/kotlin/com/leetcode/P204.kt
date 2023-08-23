package com.leetcode

// https://github.com/antop-dev/algorithm/issues/503
class P204 {
    fun countPrimes(n: Int): Int {
        val set = mutableSetOf<Int>()
        for (x in 2 until n) {
            // 짝수는 모두 2의 배수다
            if (x == 2 || x % 2 != 0) {
                set += x
            }
        }
        // 에라토스테네스의 체
        var x = 2
        while (x * x < n) {
            var v = x * x
            if (v in set) {
                while (v <= n) {
                    set -= v
                    v += x
                }
            }
            x++
        }
        return set.size
    }
}
