package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/462
class P152996 {
    fun solution(weights: IntArray): Long {
        val map = weights.groupBy { it }
            .map { it.key.toDouble() to it.value.size.toLong() }
            .toMap()

        var answer = 0L
        for ((weight, count) in map) {
            answer += count * (count - 1) / 2
            map[weight * 2.0]?.run { answer += this * count }
            map[weight * 3.0 / 2.0]?.run { answer += this * count }
            map[weight * 4.0 / 3.0]?.run { answer += this * count }
        }
        return answer
    }
}
