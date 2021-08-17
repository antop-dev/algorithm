package kr.co.programmers

// https://github.com/antop-dev/algorithm/issues/314
class P83201 {
    fun solution(scores: Array<IntArray>): String {
        val n = scores.size
        val answer = StringBuffer()

        for (j in 0 until n) {
            val arr = Array(n) { i -> scores[i][j] }
            var min = Int.MAX_VALUE
            var max = Int.MIN_VALUE
            var count = 0

            var m = n
            var sum = 0

            for (i in 0 until n) {
                val v = scores[i][j]
                sum += v
                if (v < min) min = v
                if (v > max) max = v
                if (v == scores[j][j]) count++
            }

            // 유일한 최고점이거나 최저점
            if ((arr[j] == min || arr[j] == max) && count == 1) {
                sum -= arr[j]
                m--
            }

            val average = sum.toDouble() / m
            answer.append(when {
                average >= 90 -> "A"
                average >= 80 -> "B"
                average >= 70 -> "C"
                average >= 50 -> "D"
                else -> "F"
            })
        }

        return answer.toString()
    }
}
