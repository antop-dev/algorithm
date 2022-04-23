package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/390
class P12939 {
    fun solution(s: String): String {
        val S = " $s"
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE

        var num = 0 // 만들어지는 수
        var m = 1 // 곱샘

        for (i in S.indices.reversed()) {
            when (val c = S[i]) {
                in '0'..'9' -> { // 숫자
                    num += (c - '0') * m
                    m *= 10
                }
                '-' -> { // 부호
                    num *= -1
                }
                else -> { // 공백
                    if (num > max) max = num
                    if (num < min) min = num
                    num = 0
                    m = 1
                }
            }
        }

        return "$min $max"
    }
}