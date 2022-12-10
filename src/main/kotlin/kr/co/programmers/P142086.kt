package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/441
class P142086 {
    fun solution(s: String): IntArray {
        val map = mutableMapOf<Char, Int>()
        val answer = IntArray(s.length)
        for (i in s.indices) {
            val c = s[i]
            answer[i] = map[c]?.run { i - this } ?: -1
            map[c] = i
        }
        return answer
    }
}
