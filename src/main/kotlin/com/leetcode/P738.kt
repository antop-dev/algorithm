package com.leetcode

// https://github.com/antop-dev/algorithm/issues/330
class P738 {
    fun monotoneIncreasingDigits(n: Int): Int {
        var answer = 0 // 답
        var num = n // 주어진 수
        var m = 1 // 자리수를 완성하기 위해 10씩 곱한다
        var prev = 9 // 이전 값
        while (num > 0) {
            var v = num % 10
            if (v > prev) {
                v--
                answer = (1 * m) - 1
            }

            answer += v * m

            num /= 10
            m *= 10
            prev = v
        }
        return answer
    }
}
