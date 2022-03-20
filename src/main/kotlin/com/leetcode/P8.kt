package com.leetcode

class P8 {
    fun myAtoi(s: String): Int {
        var answer = 0
        var sign = 1 // + or -
        var i = 0
        val n = s.length
        // 공백으로 시작하는 부분을 버린다.
        while (i < n && s[i] == ' ') i++
        // 부호인지 확인
        if (i < n && s[i] == '+') {
            i++
        } else if (i < n && s[i] == '-') {
            sign = -1
            i++
        }
        // 다음으로 숫자가 나와야 한다.
        while (i < n && Character.isDigit(s[i])) {
            val v = s[i] - '0'
            // 숫자가 넘치게 되는지 확인한다.
            // answer * 10 + answer 하기 전 answer 값으로 Int 범위를 넘는지 판단한다.
            if (answer > Int.MAX_VALUE / 10 || answer == Int.MAX_VALUE / 10 && v > Int.MAX_VALUE % 10) {
                return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
            }

            answer = 10 * answer + v
            i++
        }
        return sign * answer
    }
}
