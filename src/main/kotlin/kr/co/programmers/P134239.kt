package kr.co.programmers

// https://school.programmers.co.kr/learn/courses/30/lessons/134239
class P134239 {

    fun solution(k: Int, ranges: Array<IntArray>): DoubleArray {
        // 우박 수열
        val hs = hailSequence(k)
        // 한칸당 넓이 (누적합)
        val area = area(hs)
        // 구간들의 넓이
        return ranges.map { (a, b) ->
            a to hs.size - 1 + b
        }.map { (from, to) ->
            when {
                from > to -> -1.0
                else -> area[to] - area[from]
            }
        }.toDoubleArray()
    }

    private fun area(hs: IntArray) = DoubleArray(hs.size).apply {
        for (i in 1 until hs.size) {
            val min = minOf(hs[i - 1], hs[i])
            val max = maxOf(hs[i - 1], hs[i])
            val v = min + ((max - min) / 2.0)
            this[i] = this[i - 1] + v // 누적합
        }
    }

    private fun hailSequence(k: Int) = mutableListOf<Int>().apply {
        var n = k
        while (n >= 1) {
            this += n
            if (n <= 1) break
            n = if (n % 2 == 0) { // 짝수
                n / 2
            } else { // 홀수
                (n * 3) + 1
            }
        }
    }.toIntArray()

}
