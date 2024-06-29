package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/390
class P12939 {
    fun solution(s: String): String {
        val sb = StringBuilder().apply {
            append(" ")
            append(s)
            reverse()
        }

        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        var num = 0 // 만들어지는 수
        var digit = 1 // 자리수 곱샘
        for (ch in sb) {
            when (ch) {
                in '0'..'9' -> { // 숫자
                    num += (ch - '0') * digit
                    digit *= 10
                }
                '-' -> { // 부호
                    num *= -1
                }
                else -> { // 공백
                    min = minOf(min, num)
                    max = maxOf(max, num)
                    num = 0
                    digit = 1
                }
            }
        }
        return "$min $max"
    }
}
