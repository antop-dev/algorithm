package com.leetcode

// https://github.com/antop-dev/algorithm/issues/496
class P873 {
    fun lenLongestFibSubseq(arr: IntArray): Int {
        val set = arr.toSet()
        var answer = 2

        for (i in arr.indices) {
            for (j in i + 1 until arr.size) {
                var a = arr[i]
                var b = arr[j]
                var len = 2
                while (a + b in set) {
                    b += a
                    a = b - a
                    len++
                }
                answer = maxOf(answer, len)
            }
        }

        return if (answer > 2) answer else 0
    }
}
