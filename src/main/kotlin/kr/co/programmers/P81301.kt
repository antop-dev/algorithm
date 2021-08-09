package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/312
class P81301 {
    val map = mapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
    )

    fun solution(s: String): Int {
        var answer = 0
        var x = 1
        var w = ""

        for (i in s.indices.reversed()) {
            if (s[i] in '0'..'9') {
                answer += (s[i] - '0') * x
                x *= 10
            } else {
                w = s[i] + w
                map[w]?.run {
                    answer += this * x
                    x *= 10
                    w = ""
                }
            }
        }

        return answer
    }
}
