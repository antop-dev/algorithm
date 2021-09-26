package com.leetcode

// https://github.com/antop-dev/algorithm/issues/330
class P738 {
    fun monotoneIncreasingDigits(n: Int): Int {
        // number → array
        val arr = IntArray(10).apply {
            var i = lastIndex
            var num = n
            while (num > 0) {
                this[i--] = num % 10
                num /= 10
            }
        }
        // greedy
        for (i in arr.lastIndex - 1 downTo 0) {
            if (arr[i] > arr[i + 1]) {
                for (j in i + 1 until arr.size) {
                    arr[j] = 9
                }
                arr[i]--
            }
        }
        // array → number
        var answer = 0
        var m = 1
        for (i in arr.lastIndex downTo 0) {
            answer += arr[i] * m
            m *= 10
        }
        return answer
    }
}
