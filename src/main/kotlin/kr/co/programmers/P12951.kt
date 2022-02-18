package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/377
class P12951 {
    fun solution(s: String): String {
        return s.split(" ")
            .map { it.toLowerCase() }.joinToString(" ") {
                if (it.isNotEmpty()) it.substring(0, 1).toUpperCase() + it.substring(1)
                else it
            }
    }
}
